package com.tao.framework.saka.annotation;

import java.lang.annotation.*;

/**
 * 订阅时间处理注解
 *
 * @author tao
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SakaSubscribe {
  //调试模式
  boolean debug() default false;
}