/*
 * @project name: micro-build
 * @file name: JwtTokenConfig
 * @package Name: cn.iqoo.oauth2.config
 * @date: 2018/5/22 15:30
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * JWT
 *
 * @author wangjian-358
 * @date 2018/5/22 15:30
 * @see
 */
@Configuration
@Slf4j
public class JwtTokenConfigurer {

    @Value("${jwt.signing.key}")
    private String jwtSigningKey;

    public JwtTokenConfigurer() {
        log.info("Loading JwtTokenConfig ...");
    }

    @Bean
    public TokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        Assert.state(!StringUtils.isEmpty(jwtSigningKey), "jwtSigningKey is not configured");
        jwtAccessTokenConverter.setSigningKey(jwtSigningKey);
        return jwtAccessTokenConverter;
    }
}
