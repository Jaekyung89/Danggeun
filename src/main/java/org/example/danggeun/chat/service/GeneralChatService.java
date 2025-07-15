package org.example.danggeun.chat.service;

import lombok.RequiredArgsConstructor;
import org.example.danggeun.chat.dto.ChatListItemDto;
import org.example.danggeun.chat.dto.GeneralChatDto;
import org.example.danggeun.chat.entity.GeneralChatEntity;
import org.example.danggeun.chat.repository.GeneralChatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GeneralChatService {

    private final GeneralChatRepository chatRepository;

    // 예시: 특정 사용자 관련 채팅 목록 조회 (가장 최근 메시지 기준)
    public List<ChatListItemDto> getChatListByUserId(String userId) {

        List<GeneralChatEntity> allChats = chatRepository.findBySenderIdOrReceiverIdOrderByCreatedAtDesc(userId, userId);


        return allChats.stream()
                .collect(Collectors.groupingBy(chat -> {

                    if (userId.equals(chat.getSenderId())) {
                        return chat.getReceiverId();
                    } else {
                        return chat.getSenderId();
                    }
                }))
                .entrySet().stream()
                .map(entry -> {
                    GeneralChatEntity latestChat = entry.getValue().get(0); // 최신 메시지
                    String otherUserId = entry.getKey();

                    return new ChatListItemDto(
                            latestChat.getId(),
                            otherUserId,
                            latestChat.getMessage(),
                            "/images/sample.jpg",
                            !userId.equals(latestChat.getReceiverId()),
                            false,
                            latestChat.getSenderId(),
                            latestChat.getReceiverId()
                    );
                })
                .collect(Collectors.toList());
    }

    public String saveMessage(GeneralChatDto dto) {
        GeneralChatEntity chat = GeneralChatEntity.builder()
                .senderId(dto.getSenderId())
                .receiverId(dto.getReceiverId())
                .message(dto.getMessage())
                .build();
        chatRepository.save(chat);
        return "메시지가 저장되었습니다.";
    }

    public List<GeneralChatDto> getChatMessages(String senderId, String receiverId) {
        return chatRepository
                .findBySenderIdAndReceiverIdOrReceiverIdAndSenderIdOrderByCreatedAtAsc(senderId, receiverId, senderId, receiverId)
                .stream()
                .map(chat -> {
                    GeneralChatDto dto = new GeneralChatDto();
                    dto.setSenderId(chat.getSenderId());
                    dto.setReceiverId(chat.getReceiverId());
                    dto.setMessage(chat.getMessage());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}