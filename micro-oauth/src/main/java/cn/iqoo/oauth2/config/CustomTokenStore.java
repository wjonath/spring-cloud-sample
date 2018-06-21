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
 * 自定义的 TokenStore，可以使用 JWT 然后存入 redis，对 token 增加黑、白名单功能
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
