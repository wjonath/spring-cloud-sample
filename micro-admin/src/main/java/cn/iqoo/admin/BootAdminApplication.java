/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * spring-boot 监控启动类
 *
 * @author: jonath@163.com
 * @date: 2018/5/10 0:05
 * @see:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class BootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class, args);
    }
}
