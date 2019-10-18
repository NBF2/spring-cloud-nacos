package com.cloud.spring.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @author: Administrator
 * @date: 2019/10/18
 * @modified by:
 * @modified date:
 * @problem no:
 */

@FeignClient(
        value = "nacos-provider",
        fallback = HelloFeignClientFallback.class
)
public interface HelloFeignClient {

    @GetMapping("/test/hello")
    String sayHelloFeign(@RequestParam(value = "name") String name);
}
