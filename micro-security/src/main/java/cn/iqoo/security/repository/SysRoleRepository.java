/*
 * @project name: micro-build
 * @file name: SysRoleRepository
 * @package Name: cn.iqoo.security.repository
 * @date: 2018/5/18 16:00
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.security.repository;

import cn.iqoo.security.entity.SysRole;
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
