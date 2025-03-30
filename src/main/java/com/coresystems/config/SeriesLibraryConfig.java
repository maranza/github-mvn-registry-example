package com.coresystems.config;

import com.coresystems.tvseries.boundary.SeriesClient;
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
public class SeriesLibraryConfig {

  @Produces
  SeriesClient produceSeriesClient(@RestClient SeriesClient seriesClient) {
    return seriesClient;
  }
}
