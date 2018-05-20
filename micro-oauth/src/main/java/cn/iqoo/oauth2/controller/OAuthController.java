/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/18 22:03
 */
@RestController
public class OAuthController {

    @GetMapping("/")
    public void index() {

    }

    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

    @GetMapping("/code")
    public String getToken(String code) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://localhost:8012/oauth/token?grant_type=authorization_code&code=%s", code);
        String resp = restTemplate.getForObject(url, String.class);
        return resp;
    }
}
