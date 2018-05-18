/*
 * @project name: micro-build
 * @file name: AuthController
 * @package Name: cn.iqoo.oauth2.controller
 * @date: 2018/5/18 9:50
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/18 9:50
 * @see
 */
@Slf4j
@Controller
public class AuthController {

    @GetMapping("/user")
    public String getUser() {
        log.debug("security server");
        return "user";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
