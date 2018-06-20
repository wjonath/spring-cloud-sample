package cn.iqoo.blog.controller;

import cn.iqoo.blog.entity.Blog;
import cn.iqoo.blog.feign.UserFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Slf4j
@RestController
public class BlogController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/blog/list")
    public Blog listBlog() {
        Blog blog = new Blog();
        blog.setTitle("first").setAuthor("wj")
                .setCategory(2001)
                .setCreateTime(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        return blog;
    }

    @GetMapping("/blog/user")
    public String getBlogUser() {
        String u = userFeign.getUserInfo();
        log.info("start blog feign...");
        return u;
    }
}
