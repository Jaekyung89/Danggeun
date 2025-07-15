package org.example.danggeun.chat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralChatDto {
    private String senderId;
    private String receiverId;
    private String message;
}