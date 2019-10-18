package com.cloud.spring.demo.feign;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: Administrator
 * @date: 2019/10/18
 * @modified by:
 * @modified date:
 * @problem no:
 */
@Component
public class HelloFeignClientFallback implements HelloFeignClient {
    @Override
    public String sayHelloFeign(String name) {
        return "hello, " + name + " sorry, system error !";
    }
}
