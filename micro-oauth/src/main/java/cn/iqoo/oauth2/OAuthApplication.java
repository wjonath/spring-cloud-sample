package cn.iqoo.oauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动类
 *
 * @author: jonath@163.com
 * @date: 2018/5/17 23:25
 */
@SpringBootApplication
@MapperScan("cn.iqoo.oauth2.mapper")
public class OAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuthApplication.class, args);
    }
}
