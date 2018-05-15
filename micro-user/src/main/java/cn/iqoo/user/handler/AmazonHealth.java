package cn.iqoo.user.handler;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author jonath@163.com
 * @date 2018/5/15 18:26
 */
public class AmazonHealth implements HealthIndicator {
    @Override
    public Health health() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getForObject("http://www.amazon.com", String.class);
            return Health.up().build();
        } catch (Exception ex) {
            return Health.down().build();
        }
    }
}
