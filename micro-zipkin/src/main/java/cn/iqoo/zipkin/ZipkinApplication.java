/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/11 23:15
 * @see:
 */
@SpringBootApplication
@EnableZipkinStreamServer
@EnableDiscoveryClient
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
