/*
 * @Project Name: JAVA
 * @File Name: MvcConfig
 * @Package Name: com.hhly.sns.api.config
 * @Date: 2017/11/15 9:11
 * @Creator: wangjian-358
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.sns.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * springMVC 配置
 * @author wangjian-358
 * @date 2017/11/15 9:11
 * @see
 */
@Configuration
@EnableWebMvc
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		/** addResourceLocations指的是文件放置的目录，addResourceHandler指的是对外暴露的访问路径 */
		registry.addResourceHandler("/swagger/**").addResourceLocations("/swagger/");
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
		super.addResourceHandlers(registry);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("redirect:/swagger/index.htm");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		super.addViewControllers(registry);
	}
}
