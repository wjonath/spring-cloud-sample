/*
 * @project name: micro-build
 * @file name: SysRoleRepository
 * @package Name: cn.iqoo.oauth2.repository
 * @date: 2018/5/18 16:00
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.repository;

import cn.iqoo.oauth2.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/18 16:00
 * @see
 */
public interface SysRoleRepository extends JpaRepository<SysRole, Long> {
    SysRole findByName(String name);
}
