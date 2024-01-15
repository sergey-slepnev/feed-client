package ssp.micro.feedclient.web.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CustomerDto(UUID id,
                          String name) {
}