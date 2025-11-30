package com.ai.lovable_clone.entity;

import com.ai.lovable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    private Long id;

    private User user;

    private Plan plan;

    private SubscriptionStatus subscriptionStatus;

    private String stripeCustomerId;

    private String stripeSubscriptionId;

    private Instant currentPeriodStart;

    private Instant currentPeriodEnd;

    private Boolean cancelAtPeriodEnd = false;

    private Instant createdAt;

    private Instant updatedAt;
}
