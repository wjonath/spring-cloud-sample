package cn.iqoo.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Props {

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
