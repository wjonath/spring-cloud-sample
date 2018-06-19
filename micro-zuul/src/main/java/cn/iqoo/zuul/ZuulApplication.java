/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/6/19 16:58
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
