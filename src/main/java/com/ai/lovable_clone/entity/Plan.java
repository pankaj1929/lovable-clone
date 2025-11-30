package com.ai.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Plan {

    private Long id;

    private String name;

    private String stripePriceId;

    private Integer maxProjects;

    private Integer maxTokensPerDay;

    private Integer maxPreviews; // max number of previews allowed per plan

    private Boolean unLimitedAi; // unlimited access to llm ignoring max token per day

    private Boolean active;
}
