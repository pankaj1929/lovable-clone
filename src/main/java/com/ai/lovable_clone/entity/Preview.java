package com.ai.lovable_clone.entity;

import com.ai.lovable_clone.enums.PreviewStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    private Long id;

    private Projects projects;

    private String nameSpace;

    private String podName;

    private String previewUrl;

    private PreviewStatus previewStatus;

    private Instant startedAt;

    private Instant terminatedAt;

    private Instant createdAt;


}
