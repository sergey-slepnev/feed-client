package ssp.micro.feedclient.integration.web.client;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ssp.micro.feedclient.web.client.FeedFactoryClient;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RequiredArgsConstructor
@SpringBootTest
class FeedFactoryClientIT {

    private final FeedFactoryClient factoryClient;

    @Test
    void getFeedById_shouldReturnFeedDtoById() {
        var expectedFeed = factoryClient.getFeedById(UUID.randomUUID());

        assertThat(expectedFeed).isNotNull();
    }
}