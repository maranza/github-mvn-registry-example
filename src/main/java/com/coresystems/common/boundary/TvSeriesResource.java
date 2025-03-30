package com.coresystems.common.boundary;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/31
 * @description :
 * @since : 2025/03/31, Mon
 */
@ApplicationScoped
@Path("/")
public class TvSeriesResource {

  @Inject
  private TvSeriesService tvSeriesService;

  @GET
  @Path("/all")
  public Response getAllShows() {
    return this.tvSeriesService.getTvAllShows();
  }



}
