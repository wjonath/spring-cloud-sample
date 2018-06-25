package cn.iqoo.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 * @date: 2018/5/16 10:39
 * @author: jonath@163.com
 */
@Configuration
public class PropertiesReader {

    @Value("${server.port:0}")
    private String port;

    @Value("${mybatis.mapper-locations}")
    private String locations;

    public String getPort() {
        return port;
    }

    public String getLocations() {
        return locations;
    }
}
