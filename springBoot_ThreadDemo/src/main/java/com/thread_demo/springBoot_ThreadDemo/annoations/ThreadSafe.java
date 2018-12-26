package com.thread_demo.springBoot_ThreadDemo.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来标记线程安全
 * @Author Elvis Chen
 * @Date 2018/12/26 17:12
 * @Version 1.0
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {

    String value() default "";

}
