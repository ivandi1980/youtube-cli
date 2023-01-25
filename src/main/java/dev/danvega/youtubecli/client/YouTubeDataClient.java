package dev.danvega.youtubecli.client;

import dev.danvega.youtubecli.model.SearchListResponse;
import dev.danvega.youtubecli.model.VideoListResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface YouTubeDataClient {

    @GetExchange("/search?part=id&channelId={channelId}&order=date&maxResults={maxResults}&key={key}")
    SearchListResponse search(@PathVariable String channelId, @PathVariable String key, @PathVariable Integer maxResults);

    @GetExchange("/videos?part=id&part=statistics&part=snippet&id={videoId}&key={key}")
    VideoListResponse getVideo(@PathVariable String videoId, @PathVariable String key);

}
