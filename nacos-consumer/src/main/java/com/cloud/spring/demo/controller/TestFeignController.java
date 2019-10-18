package com.cloud.spring.demo.controller;

import com.cloud.spring.demo.feign.HelloFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/test/feign")
@AllArgsConstructor
public class TestFeignController {

    private HelloFeignClient helloFeignClient;

    @GetMapping("/hello")
    public String helloFeign(String name) {
        return helloFeignClient.sayHelloFeign(name);
    }
}
