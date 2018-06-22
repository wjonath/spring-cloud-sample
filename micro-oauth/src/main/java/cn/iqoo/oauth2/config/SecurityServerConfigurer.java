package cn.iqoo.oauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.sql.DataSource;

/**
 * TODO
 *
 * @author jonath@163.com
 * @date 2018/5/18 9:32
 * @see
 */
@Configuration
@EnableAuthorizationServer
public class SecurityServerConfigurer extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtAccessTokenConverter jwtAccessTokenConverter;
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
    @Autowired
    private DataSource dataSource;

    @Bean
    public TokenStore tokenStore() {
        return new CustomTokenStore(jwtAccessTokenConverter);
//        return new InMemoryTokenStore();
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()")
                .allowFormAuthenticationForClients();
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client")
                .scopes("app")
                .secret("android")
                .authorizedGrantTypes("password", "authorization_code", "refresh_token")
                .and()
                .withClient("625d5ef4fe9dc21708ff")
                .scopes("read", "write")
                .secret("09528ccc9a12ad5f81be0e71c1fd017ce4044af2")
                .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .authenticationManager(authenticationManager)
                .tokenStore(tokenStore())
                .accessTokenConverter(jwtAccessTokenConverter);

//        DefaultTokenServices tokenServices = new DefaultTokenServices();
//        tokenServices.setAccessTokenValiditySeconds(5);
//        tokenServices.setTokenStore(endpoints.getTokenStore());
//        tokenServices.setClientDetailsService(endpoints.getClientDetailsService());
//        tokenServices.setTokenEnhancer(endpoints.getTokenEnhancer());
//        endpoints.tokenServices(tokenServices);
    }
}
