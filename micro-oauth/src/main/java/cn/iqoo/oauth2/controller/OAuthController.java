/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/18 22:03
 */
@Controller
public class OAuthController {

    @GetMapping("/")
    public void index() {

    }

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    public String userLogin() {
        return "login";
    }

    @GetMapping("/code")
    public String getToken(String code) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://localhost:8012/oauth/token?grant_type=authorization_code&code=%s", code);
        String resp = restTemplate.getForObject(url, String.class);
        return resp;
    }
}
