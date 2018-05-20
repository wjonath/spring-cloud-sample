/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.oauth2.mapper;

import cn.iqoo.oauth2.entity.OauthClientDetails;

import java.util.List;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/19 10:26
 */
public interface BaseMapper<T, PK> {
    int deleteByPrimaryKey(PK pk);

    int insert(T record);

    OauthClientDetails selectByPrimaryKey(PK pk);

    List<OauthClientDetails> selectAll();

    int updateByPrimaryKey(T record);
}
