/*
 * @author: jonath@163.com
 * Copyright 2018
 */
package cn.iqoo.blog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * TODO
 *
 * @author: jonath@163.com
 * @date: 2018/5/11 22:42
 * @see:
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Blog {
    private String title;
    private int category;
    private Date createTime;
    private String author;
}
