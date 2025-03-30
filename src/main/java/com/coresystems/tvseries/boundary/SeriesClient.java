package com.coresystems.tvseries.boundary;

import com.coresystems.common.entity.TvSeries;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/singlesearch")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface SeriesClient {

  @GET
  @Path("/shows")
  TvSeries get(@QueryParam("q") String title);
}
