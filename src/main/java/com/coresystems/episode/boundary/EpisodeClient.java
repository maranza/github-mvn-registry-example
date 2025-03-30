package com.coresystems.episode.boundary;

import com.coresystems.common.entity.Episode;
import com.coresystems.common.entity.TvSeries;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;


/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/30
 * @description :
 * @since : 2025/03/30, Sun
 */
@Path("/shows")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface EpisodeClient {

  @GET
  List<TvSeries> getAllShows();

  @GET
  @Path("/{id}/episodes")
  List<Episode> getEpisodes(@PathParam("id") Long id);
}
