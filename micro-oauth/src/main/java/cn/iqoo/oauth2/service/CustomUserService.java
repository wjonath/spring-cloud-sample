/*
 * @project name: micro-build
 * @file name: UserAuthService
 * @package Name: cn.iqoo.oauth2.service
 * @date: 2018/5/18 14:13
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.service;

import cn.iqoo.oauth2.entity.SysUser;
import cn.iqoo.oauth2.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/18 14:13
 * @see
 */
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.findByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException(String.format("%s not found!", username));
        }

        UserDetails userDetails = new User(username, sysUser.getPassword(), sysUser.getAuthorities());
        return userDetails;
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.printf(encoder.encode("root"));
    }
}
