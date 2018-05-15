

package com.hhly.sns.api.config;

import ch.qos.logback.ext.spring.web.LogbackConfigListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * 注册 filter、listener、servlet，替代web.xml中的配置
 *
 * @author wangjian-358
 * @date 2017/11/14 18:46
 * @see
 */
@Configuration
public class ApplicationConfigurer extends SpringBootServletInitializer {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(99);
        return viewResolver;
    }

    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(10000000);
        return resolver;
    }
}
