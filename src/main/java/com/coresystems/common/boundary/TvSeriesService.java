package com.coresystems.common.boundary;

import com.coresystems.common.entity.Episode;
import com.coresystems.common.entity.TvSeries;
import com.coresystems.episode.boundary.EpisodeClient;
import com.coresystems.tvseries.boundary.SeriesClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.util.List;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/30
 * @description :
 * @since : 2025/03/30, Sun
 */
@ApplicationScoped
public class TvSeriesService {

  private final Logger LOG = Logger.getLogger(TvSeriesService.class);

  @Inject
  @RestClient
  SeriesClient seriesClient;

  @RestClient
  EpisodeClient episodeClient;

  public Response getTvAllShows() {
    try {
      List<TvSeries> series = episodeClient.getAllShows();
      return Response.ok(series).build();
    } catch (Exception e) {
      e.printStackTrace();
      return Response.status(404).entity("Not Found").build();
    }
  }

  public Response getTvSeries(String name) {
    try {
      TvSeries series = seriesClient.get(name);
      return Response.ok(List.of(series)).build();
    } catch (Exception e) {
      e.printStackTrace();
      return Response.status(404).entity("Not Found").build();
    }
  }

  public Response getEpisodesOfSeries(Long id) {
    LOG.info("Id is: " + id);
    try {
      List<Episode> episodes = episodeClient.getEpisodes(id);
      return Response.ok(episodes).build();
    } catch (Exception e) {
      e.printStackTrace();
      return Response.status(404).entity("Not Found").build();
    }
  }

}
