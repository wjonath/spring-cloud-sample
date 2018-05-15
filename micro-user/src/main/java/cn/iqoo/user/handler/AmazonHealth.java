/*
 * @project name: spring-cloud-sample
 * @file name: AmazonHealth
 * @package Name: cn.iqoo.user.handler
 * @date: 2018/5/15 18:26
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.user.handler;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.client.RestTemplate;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/15 18:26
 * @see
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
