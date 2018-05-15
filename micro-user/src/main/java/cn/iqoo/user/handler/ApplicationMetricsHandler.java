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
 * 自定义度量信息，可用于业务监控
 *
 * @author jonath@163.com
 * @date 2018/5/15 18:16
 */
@Component
public class ApplicationMetricsHandler implements PublicMetrics {

    @Autowired
    private ApplicationContext context;

    @Override
    public Collection<Metric<?>> metrics() {
        List<Metric<?>> metrics = new ArrayList<>();
        metrics.add(new Metric<>("spring.ext.date", context.getStartupDate()));
        return metrics;
    }
}
