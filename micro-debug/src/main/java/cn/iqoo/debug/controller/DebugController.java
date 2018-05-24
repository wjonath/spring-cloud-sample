/*
 * @project name: micro-build
 * @file name: DebugController
 * @package Name: cn.iqoo.debug.controller
 * @date: 2018/5/24 9:34
 * @creator: wangjian-358
 * @line------------------------------
 * @modifier:
 * @date:
 * @content:
 */
package cn.iqoo.debug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${TODO}
 *
 * @author wangjian-358
 * @date 2018/5/24 9:34
 * @see
 */
@RestController
public class DebugController {

    @GetMapping("/debug")
    public String debug() {
        return "debug";
    }
}
