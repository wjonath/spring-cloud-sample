/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.oauth2.service;

import java.io.Serializable;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/6/21 12:04
 */
public interface BaseService<T, PK extends Serializable> {

    T selectByPrimaryKey(PK pk);
}
