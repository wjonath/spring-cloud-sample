package cn.iqoo.user.config;

import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 注册 filter、listener、servlet，替代web.xml中的配置
 *
 * @author jonath@163.com
 * @date 2017/11/14 18:46
 */
@Configuration
public class ApplicationConfigurer extends SpringBootServletInitializer {

    /**
     * jsp 解析c
     * @date: 2018/5/15 22:40
     * @author: jonath@163.com
     * @return
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(99);
        return viewResolver;
    }

    /**
     * 文件上传
     * @date: 2018/5/15 22:40
     * @author: jonath@163.com
     * @return
     */
/*    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(10000000);
        return resolver;
    }*/
}
