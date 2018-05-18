/*
 * @project name: micro-build
 * @file name: SysUserRepository
 * @package Name: cn.iqoo.security.repository
 * @date: 2018/5/18 15:59
 * @creator: jonath@163.com
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.security.repository;

import cn.iqoo.security.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jonath@163.com
 *
 * @author jonath@163.com
 * @date 2018/5/18 15:59
 * @see
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}