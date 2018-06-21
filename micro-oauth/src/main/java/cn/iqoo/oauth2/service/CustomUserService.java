/*
 * @project name: micro-build
 * @file name: UserAuthService
 * @package Name: cn.iqoo.security.service
 * @date: 2018/5/18 14:13
 * @creator: jonath@163.com
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.oauth2.service;

import cn.iqoo.oauth2.entity.UserBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * jonath@163.com
 *
 * @author jonath@163.com
 * @date 2018/5/18 14:13
 * @see
 */
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    UserBaseService userBaseService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserBase userBase = userBaseService.selectByPrimaryKey(1);
        if (userBase == null) {
            throw new UsernameNotFoundException(String.format("%s not found!", username));
        }

        UserDetails userDetails = new User(username, null, null);
        return userDetails;
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.printf(encoder.encode("root"));
    }
}
