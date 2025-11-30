package com.ai.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class ProjectFile {

    private Long id;

    private Projects projects;

    private String path;

    private String minioObjectKey;

    private Instant createdAt;

    private Instant updatedAt;

    private User createdBy;

    private User updatedBy;
}
