package com.ai.lovable_clone.entity;

import com.ai.lovable_clone.enums.MessageRole;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ChatMessage {

    private Long id;

    private ChatSession chatSession;

    private String content;

    private MessageRole messageRole;

    private String toolCalls; // JSON array of tool calls

    private Integer tokenUsed;

    private Instant createdAt;

}
