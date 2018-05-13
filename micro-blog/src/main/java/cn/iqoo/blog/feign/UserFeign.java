/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.blog.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/11 23:28
 * @see:
 */
@FeignClient(name = "micro-user")
public interface UserFeign {

    @GetMapping("/user")
    String getUserInfo();
}
