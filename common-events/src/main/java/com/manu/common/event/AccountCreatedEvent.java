package com.manu.common.event;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record AccountCreatedEvent(
        String userId,
        String accountId,
        String email,
        LocalDate createdAt
) {}
