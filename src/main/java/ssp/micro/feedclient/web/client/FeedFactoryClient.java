package ssp.micro.feedclient.web.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import ssp.micro.feedclient.web.model.FeedDto;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class FeedFactoryClient {

    private static final String FEED_FACTORY_PATH_V1 = "/api/v1/feeds/";

    @Value("${my-app.feed-client.apihost}")
    private final String apihost;
    private final RestTemplateBuilder restTemplateBuilder;

    public FeedDto getFeedById(UUID id) {
        return restTemplateBuilder.build()
                .getForObject(apihost + FEED_FACTORY_PATH_V1 + id.toString(), FeedDto.class);
    }
}