/*
 * @project name: micro-build
 * @file name: SysRoleRepository
 * @package Name: cn.iqoo.security.repository
 * @date: 2018/5/18 16:00
 * @creator: jonath@163.com
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.security.repository;

import cn.iqoo.security.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jonath@163.com
 *
 * @author jonath@163.com
 * @date 2018/5/18 16:00
 * @see
 */
public interface SysRoleRepository extends JpaRepository<SysRole, Long> {
    SysRole findByName(String name);
}
