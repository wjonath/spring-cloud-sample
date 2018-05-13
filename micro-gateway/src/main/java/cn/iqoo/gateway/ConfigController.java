/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/13 22:22
 * @see:
 */
@RestController
public class ConfigController {
    @GetMapping("/baidu")
    public String baidu() {
        return "baidu";
    }
}
