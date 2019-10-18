package com.cloud.spring.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author: Administrator
 * @date: 2019/10/18
 * @modified by:
 * @modified date:
 * @problem no:
 */

@RestController
@RequestMapping("/test/ribbon")
@AllArgsConstructor
public class HelloController {

    private RestTemplate restTemplate;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloError")
    public String helloRestTemplate(String name) {
        return restTemplate.getForObject("http://nacos-provider/test/hello?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hello, " + name + ", sorry, the system is error !";
    }

}
