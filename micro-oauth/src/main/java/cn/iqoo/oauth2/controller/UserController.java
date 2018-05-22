/*
 * @project name: micro-build
 * @file name: UserController
 * @package Name: cn.iqoo.oauth2.controller
 * @date: 2018/5/22 17:47
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/22 17:47
 * @see
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}

