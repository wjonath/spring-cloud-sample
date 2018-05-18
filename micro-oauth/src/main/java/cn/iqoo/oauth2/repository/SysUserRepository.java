/*
 * @project name: micro-build
 * @file name: SysUserRepository
 * @package Name: cn.iqoo.oauth2.repository
 * @date: 2018/5/18 15:59
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.repository;

import cn.iqoo.oauth2.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/18 15:59
 * @see
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}