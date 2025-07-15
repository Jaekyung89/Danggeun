package org.example.danggeun.chat.service;

import lombok.RequiredArgsConstructor;
import org.example.danggeun.chat.entity.AiChatEntity;
import org.example.danggeun.chat.repository.AiChatRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.transaction.annotation.Transactional;

@Service
@ConditionalOnProperty(name = "openai.api-key")
@RequiredArgsConstructor
public class AiChatService {

    private final AiChatRepository aiChatRepository;

    @Value("${openai.api-key}")
    private String apiKey;

    @Value("${openai.model:gpt-3.5-turbo}")
    private String model;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Transactional
    public String askAndSave(String question) {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://api.openai.com/v1/chat/completions")
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();

        String body = """
            {
              "model": "%s",
              "messages": [
                { "role": "system", "content": "You are a helpful assistant." },
                { "role": "user", "content": "%s" }
              ],
              "temperature": 0.7
            }
            """.formatted(model, question.replace("\"", "\\\""));

        String response = webClient.post()
                .header("Content-Type", "application/json")
                .bodyValue(body)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        String aiAnswer = "AI 응답을 불러오지 못했습니다.";
        try {
            JsonNode root = objectMapper.readTree(response);
            JsonNode contentNode = root.path("choices").get(0).path("message").path("content");
            if (!contentNode.isMissingNode()) {
                aiAnswer = contentNode.asText();
            }
        } catch (Exception e) {
            // parsing 실패 시 기본 메시지 유지
        }

        // 대화 저장
        AiChatEntity chat = new AiChatEntity();
        chat.setUserQuestion(question);
        chat.setAiAnswer(aiAnswer);
        aiChatRepository.save(chat);

        return aiAnswer;
    }
}