/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.oauth2.service.impl;

import cn.iqoo.oauth2.entity.UserBase;
import cn.iqoo.oauth2.mapper.BaseMapper;
import cn.iqoo.oauth2.mapper.UserBaseMapper;
import cn.iqoo.oauth2.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/6/21 12:06
 */
@Service
public class UserBaseServiceImpl extends BaseServiceImpl<UserBase, Integer> implements UserBaseService {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public BaseMapper<UserBase, Integer> getBaseMapper() {
        return userBaseMapper;
    }
}
