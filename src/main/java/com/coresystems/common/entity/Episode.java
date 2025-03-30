package com.coresystems.common.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/30
 * @description :
 * @since : 2025/03/30, Sun
 */
public record Episode(@JsonProperty("summary")
                      String summary,

                      @JsonProperty("number")
                      Integer number,

                      @JsonProperty("airtime")
                      String airtime,

                      @JsonProperty("airdate")
                      String airdate,

                      @JsonProperty("name")
                      String name,

                      @JsonProperty("season")
                      Integer season,

                      @JsonProperty("runtime")
                      Integer runtime,

                      @JsonProperty("airstamp")
                      String airstamp,

                      @JsonProperty("id")
                      Long id,

                      @JsonProperty("type")
                      String type,

                      @JsonProperty("url")
                      String url) {
}
