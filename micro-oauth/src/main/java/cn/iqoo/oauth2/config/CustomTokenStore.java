/*
 * @project name: micro-build
 * @file name: CustomTokenStore
 * @package Name: cn.iqoo.oauth2.config
 * @date: 2018/5/24 11:23
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.config;

import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/24 11:23
 * @see
 */
public class CustomTokenStore extends JwtTokenStore {

    /**
     * Create a JwtTokenStore with this token enhancer (should be shared with the DefaultTokenServices if used).
     *
     * @param jwtTokenEnhancer
     */
    public CustomTokenStore(JwtAccessTokenConverter jwtTokenEnhancer) {
        super(jwtTokenEnhancer);
    }
}
