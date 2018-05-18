/*
 * @project name: micro-build
 * @file name: SysRole
 * @package Name: cn.iqoo.oauth2.entity
 * @date: 2018/5/18 15:51
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * ${TODO}
 *
 * @author wangjian-358
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
