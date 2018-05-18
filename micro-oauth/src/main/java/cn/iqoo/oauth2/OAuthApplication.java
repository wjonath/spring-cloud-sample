package cn.iqoo.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 应用启动类
 *
 * @author: jonath@163.com
 * @date: 2018/5/17 23:25
 */
@SpringBootApplication
@EnableAuthorizationServer
public class OAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuthApplication.class, args);
    }
}
