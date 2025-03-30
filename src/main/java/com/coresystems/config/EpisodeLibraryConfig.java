package com.coresystems.config;

import com.coresystems.episode.boundary.EpisodeClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/31
 * @description :
 * @since : 2025/03/31, Mon
 */
@ApplicationScoped
public class EpisodeLibraryConfig {

  @Produces
  @RestClientQualifier
  EpisodeClient produceEpisodeClient(@RestClient EpisodeClient episodeClient) {
    return episodeClient;
  }
}
