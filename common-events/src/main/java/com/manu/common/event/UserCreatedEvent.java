package com.manu.common.event;

import lombok.Builder;

@Builder
public record UserCreatedEvent(
        String userId,
        String email,
        String name
) implements BaseEvent {}
