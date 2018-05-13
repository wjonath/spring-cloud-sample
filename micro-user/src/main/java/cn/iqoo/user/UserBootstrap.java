package cn.iqoo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories(basePackages = {"cn.iqoo.user.repository"})
@ComponentScan("cn.iqoo")
public class UserBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserBootstrap.class, args);
    }
}
