/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/11 22:42
 * @see:
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private String title;
    private Date createTime;
}
