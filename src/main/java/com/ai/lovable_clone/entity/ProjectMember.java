package com.ai.lovable_clone.entity;

import com.ai.lovable_clone.enums.ProjectRole;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ProjectMember {

    private ProjectMemberId id;

    private Projects projects;

    private User user;

    private ProjectRole projectRole;

    private Instant invitedAt;

    private Instant acceptedAt;
}
