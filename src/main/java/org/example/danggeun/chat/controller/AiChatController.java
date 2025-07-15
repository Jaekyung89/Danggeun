package org.example.danggeun.chat.controller;

import lombok.RequiredArgsConstructor;
import org.example.danggeun.chat.dto.AiChatDto;
import org.example.danggeun.chat.service.AiChatService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chat")
public class AiChatController {

    private final AiChatService aiChatService;

    @PostMapping(value = "/ai", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String askAi(@RequestBody AiChatDto req) {
        return aiChatService.askAndSave
                (req.getQuestion());
    }

    
}