/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.security.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/18 0:20
 */
@Component
@EnableOAuth2Sso
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
}
