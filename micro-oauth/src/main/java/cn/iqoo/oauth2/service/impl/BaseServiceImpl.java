/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.oauth2.service.impl;

import cn.iqoo.oauth2.mapper.BaseMapper;
import cn.iqoo.oauth2.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/6/21 12:06
 */
public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

    @Autowired
    private BaseMapper<T, PK> baseMapper = getBaseMapper();

    public abstract BaseMapper<T, PK> getBaseMapper();

    @Override
    public T selectByPrimaryKey(PK pk) {
        return baseMapper.selectByPrimaryKey(pk);
    }
}
