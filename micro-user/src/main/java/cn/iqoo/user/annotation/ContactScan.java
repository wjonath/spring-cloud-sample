/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.user.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/15 22:21
 */
public class ContactScan implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.printf("before");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.printf("after");
        return bean;
    }
}
