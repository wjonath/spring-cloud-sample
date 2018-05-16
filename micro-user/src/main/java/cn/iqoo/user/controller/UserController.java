/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.user.controller;

import cn.iqoo.user.annotation.Contact;
import cn.iqoo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/11 23:33
 * @see:
 */
@Slf4j
@RestController
@Contact
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUserInfo() {
        String u = userService.getUserInfo(0);
        log.info("feign handle");
        return u;
    }
}
