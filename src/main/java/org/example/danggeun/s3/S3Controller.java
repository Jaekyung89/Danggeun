package org.example.danggeun.s3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/files")
public class S3Controller {

    @Autowired
    private S3Service s3Service;

    /**
     * 파일 업로드
     */
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            String fileUrl = s3Service.uploadFile(file);
            return ResponseEntity.ok("파일 업로드 성공: " + fileUrl);
        } catch (IOException e) {
            return ResponseEntity.badRequest().body("파일 업로드 실패: " + e.getMessage());
        }
    }

    /**
     * 파일 목록 조회
     */
    @GetMapping("/list")
    public ResponseEntity<List<String>> listFiles() {
        List<String> files = s3Service.listFiles();
        return ResponseEntity.ok(files);
    }

    /**
     * 파일 삭제
     */
    @DeleteMapping("/{fileName}")
    public ResponseEntity<String> deleteFile(@PathVariable String fileName) {
        try {
            s3Service.deleteFile(fileName);
            return ResponseEntity.ok("파일 삭제 성공");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("파일 삭제 실패: " + e.getMessage());
        }
    }
}
