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
package cn.iqoo.gateway.service;

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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = "$2a$10$CRMno5kbaY8z8BVQej56Uelq8alfw24Pp2.IMNT1Xo.l4Xnv/pw2i";
        UserDetails userDetails = new User(username, password, null);
        return userDetails;
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.printf(encoder.encode("user"));
    }
}
