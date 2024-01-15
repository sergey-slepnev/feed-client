package ssp.micro.feedclient.web.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record FeedDto(UUID id,
                      String feedName,
                      String feedType,
                      Long barCode) {
}