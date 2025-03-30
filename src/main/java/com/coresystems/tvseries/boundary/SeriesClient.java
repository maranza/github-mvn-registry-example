package com.coresystems.tvseries.boundary;

import com.coresystems.common.entity.TvSeries;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/30
 * @description :
 * @since : 2025/03/30, Sun
 */
@ApplicationScoped
@Path("/singlesearch")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface SeriesClient {

  @GET
  @Path("/shows")
  TvSeries get(@QueryParam("q") String title);
}
