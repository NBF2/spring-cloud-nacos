package com.cloud.spring.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: Administrator
 * @date: 2019/10/18
 * @modified by:
 * @modified date:
 * @problem no:
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Value("${username:Lily}")
    private String userName;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "zhangsan", required = false) String name) {
        return "hello, " + name + ", i am from " + port;
    }

    @GetMapping("/username")
    public String getUserName() {
        return "hello " + userName;
    }
}
