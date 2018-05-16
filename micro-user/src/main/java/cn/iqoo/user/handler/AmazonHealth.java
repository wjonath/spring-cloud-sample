package cn.iqoo.user.handler;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author jonath@163.com
 * @date 2018/5/15 18:26
 */
@Component
public class AmazonHealth implements HealthIndicator {
    @Override
    public Health health() {
        System.out.printf("check");
        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getForObject("http://www.amazon.com", String.class);
            return Health.up().withDetail("description", "amazon status is ok!").build();
        } catch (Exception ex) {
            return Health.down().withException(ex).build();
        }
    }
}
