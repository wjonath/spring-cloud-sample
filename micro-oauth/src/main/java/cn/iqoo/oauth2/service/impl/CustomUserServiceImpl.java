/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.oauth2.service.impl;

import cn.iqoo.oauth2.entity.OauthClientDetails;
import cn.iqoo.oauth2.mapper.BaseMapper;
import cn.iqoo.oauth2.mapper.OauthClientDetailsMapper;
import cn.iqoo.oauth2.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/6/21 12:06
 */
@Service
public class CustomUserServiceImpl extends BaseServiceImpl<OauthClientDetails, Integer> implements CustomUserService {

    @Autowired
    private OauthClientDetailsMapper oauthClientDetailsMapper;

    @Override
    public BaseMapper<OauthClientDetails, Integer> getBaseMapper() {
        return oauthClientDetailsMapper;
    }
}
