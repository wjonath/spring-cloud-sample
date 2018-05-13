/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.user.service.impl;

import cn.iqoo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/12 21:29
 * @see:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo(int userId) {
        log.info("user.service");
        return "user-ss";
    }
}
