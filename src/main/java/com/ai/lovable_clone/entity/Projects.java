package com.ai.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class Projects {

    private Long id;

    private String projectName;

    private User owner;

    private Boolean isPublic = false;

    private Instant createdAt;

    private Instant updatedAt;

    private Instant deletedAt; // soft delete
}
