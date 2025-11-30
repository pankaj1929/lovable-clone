package com.ai.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {

    private Long id;

    private User user;

    private Projects projects;

    private String action;

    private Integer tokenUsed;

    private Integer durationsMs;

    private String metaData;

    private Instant createdAt;
}
