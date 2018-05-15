/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.user.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 *
 * @author: jonath@163.com
 * @date: 2018/5/15 22:20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ContactScan.class)
@Documented
public @interface Contact {
    String[] value() default {};
}
