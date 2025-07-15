package org.example.danggeun.chat.repository;

import org.example.danggeun.chat.entity.GeneralChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface GeneralChatRepository extends JpaRepository<GeneralChatEntity, Long> {
    List<GeneralChatEntity> findBySenderIdAndReceiverIdOrReceiverIdAndSenderIdOrderByCreatedAtAsc(
            String senderId1, String receiverId1,
            String senderId2, String receiverId2);

    List<GeneralChatEntity> findBySenderIdOrReceiverIdOrderByCreatedAtDesc(String userId, String userId1);
}