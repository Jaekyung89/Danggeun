package org.example.danggeun.chat.repository;

import org.example.danggeun.chat.entity.AiChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiChatRepository extends JpaRepository<AiChatEntity, Long> {
}