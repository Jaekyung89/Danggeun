package org.example.danggeun.chat.controller;

import lombok.RequiredArgsConstructor;
import org.example.danggeun.chat.dto.ChatListItemDto;
import org.example.danggeun.chat.dto.GeneralChatDto;
import org.example.danggeun.chat.service.GeneralChatService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chat")
public class GeneralChatController {

    private final GeneralChatService chatService;

    @PostMapping(value = "/general", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String sendGeneralMessage(@RequestBody GeneralChatDto dto) {
        return chatService.saveMessage(dto);
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ChatListItemDto> getChatList(@RequestParam String userId) {
        return chatService.getChatListByUserId(userId);
    }
}