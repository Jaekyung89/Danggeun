package org.example.danggeun.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChatListItemDto {
    private Long chatId;
    private String name;       // 채팅방 이름 (ex: 상대방 아이디 혹은 'AI 챗봇')
    private String lastMessage;
    private String imageUrl;
    private boolean unread;
    private boolean isBot;
    private String senderId;
    private String receiverId;
}