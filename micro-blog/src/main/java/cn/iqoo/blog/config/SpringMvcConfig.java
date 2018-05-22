package cn.iqoo.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * springMVC 配置
 *
 * @author jonath@163.com
 * @date 2017/11/15 9:11
 */
@Configuration
@EnableWebMvc
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 静态资源处理
     * <p>addResourceLocations指的是文件放置的目录，addResourceHandler指的是对外暴露的访问路径</p>
     * @date: 2018/5/15 22:41
     * @author: jonath@163.com
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**  */
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        super.addResourceHandlers(registry);
    }

    /**
     * controller 转向 view
     * @date: 2018/5/15 22:41
     * @author: jonath@163.com
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/swagger/index.htm");
        super.addViewControllers(registry);
    }
}
