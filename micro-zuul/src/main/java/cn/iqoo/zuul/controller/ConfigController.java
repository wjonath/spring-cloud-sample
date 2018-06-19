/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.zuul.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/6/19 16:59
 */
@Slf4j
@RestController
public class ConfigController {

    @GetMapping("/zuul/info")
    public String getZuul() {
        log.debug("zuul");
        return "zuul";
    }
}
