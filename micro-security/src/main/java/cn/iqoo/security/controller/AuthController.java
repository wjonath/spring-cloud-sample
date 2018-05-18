
package cn.iqoo.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * jonath@163.com
 *
 * @author jonath@163.com
 * @date 2018/5/18 9:50
 * @see
 */
@Controller
public class AuthController {

    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
