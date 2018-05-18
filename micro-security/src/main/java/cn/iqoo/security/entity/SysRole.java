/*
 * @project name: micro-build
 * @file name: SysRole
 * @package Name: cn.iqoo.security.entity
 * @date: 2018/5/18 15:51
 * @creator: jonath@163.com
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.security.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * jonath@163.com
 *
 * @author jonath@163.com
 * @date 2018/5/18 15:51
 * @see
 */
@Entity
public class SysRole {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
