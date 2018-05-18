/*
 * @project name: micro-build
 * @file name: SecurityServerConfigurer
 * @package Name: cn.iqoo.security.config
 * @date: 2018/5/18 9:32
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/18 9:32
 * @see
 */
@Configuration
public class SecurityServerConfigurer extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client")
                .secret("secret")
                .authorizedGrantTypes("authorization_code")
                .scopes("app");
    }
}
