package cn.iqoo.blog.controller;

import cn.iqoo.blog.entity.BlogInfo;
import cn.iqoo.blog.feign.UserFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BlogController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/blog/list")
    public BlogInfo listBlog() {
        BlogInfo blogInfo = new BlogInfo();
        blogInfo.setTitle("first").setId(221);
//                .setCreateTime(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        return blogInfo;
    }

    @GetMapping("/blog/user")
    public String getBlogUser() {
        String u = userFeign.getUserInfo();
        log.info("start blog feign...");
        return u;
    }
}
