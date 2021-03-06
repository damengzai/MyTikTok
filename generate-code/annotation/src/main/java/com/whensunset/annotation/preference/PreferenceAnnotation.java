package com.whensunset.annotation.preference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface PreferenceAnnotation {
  boolean generateSaver() default true;
  
  String prefixKeyForAllFields() default "";
}
