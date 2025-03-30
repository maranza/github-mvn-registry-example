package com.coresystems.config;

import jakarta.inject.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2025/03/31
 * @description :
 * @since : 2025/03/31, Mon
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE })
public @interface RestClientQualifier {
}
