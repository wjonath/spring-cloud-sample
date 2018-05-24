///*
// * @project name: micro-build
// * @file name: WebSecurityConfigurer
// * @package Name: cn.iqoo.gateway.config
// * @date: 2018/5/23 15:32
// * @creator: wangjian-358
// * @line------------------------------
// * @modifier:
// * @date:
// * @content:
// */
//package cn.iqoo.gateway.config;
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
// * @date 2018/5/23 15:32
// * @see
// */
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .antMatcher("/**")
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and().csrf().disable();
//    }
//}
