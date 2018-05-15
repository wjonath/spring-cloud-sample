/*
 * @project name: spring-cloud-sample
 * @file name: ApplicationMetricsHandler
 * @package Name: cn.iqoo.user.handler
 * @date: 2018/5/15 18:16
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.user.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/15 18:16
 * @see
 */
@Component
public class ApplicationMetricsHandler implements PublicMetrics {

    @Autowired
    private ApplicationContext context;

    @Override
    public Collection<Metric<?>> metrics() {
        List<Metric<?>> metrics = new ArrayList<>();
        metrics.add(new Metric<Long>("spring.ext.date", context.getStartupDate()));
        return metrics;
    }
}
