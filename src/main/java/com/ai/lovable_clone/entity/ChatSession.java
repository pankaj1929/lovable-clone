package com.ai.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ChatSession {

    private Projects projects;

    private User user;

    private String title;

    private Instant createdAt;

    private Instant updatedAt;

    private Instant deletedAt;// soft delete
}
