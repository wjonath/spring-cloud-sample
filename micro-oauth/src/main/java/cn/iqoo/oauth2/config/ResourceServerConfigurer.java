///*
// * @project name: micro-build
// * @file name: ResourceServerConfigurer
// * @package Name: cn.iqoo.oauth2.config
// * @date: 2018/5/22 17:46
// * @creator: wangjian-358
// * @line------------------------------
// * @modifier:
// * @date:
// * @content:
// */
//package cn.iqoo.oauth2.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//
///**
// * ${TODO}
// *
// * @author wangjian-358
// * @date 2018/5/22 17:46
// * @see
// */
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/**").permitAll();
//    }
//}
