package com.coresystems.common.entity;

import java.net.URL;
import java.util.Set;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/30
 * @description :
 * @since : 2025/03/30, Sun
 */
public record TvSeries(Long id,
                       String name,
                       String url,
                       String summary,
                       String language,
                       Set<String> genres,
                       URL officialSite) {
}
