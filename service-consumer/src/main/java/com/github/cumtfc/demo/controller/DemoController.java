package com.github.cumtfc.demo.controller;

import com.github.cumtfc.demo.feign.FeignServiceHi;
import com.github.cumtfc.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
@RestController
public class DemoController {
    @Autowired
    HelloService helloService;

    @Autowired
    FeignServiceHi feignServiceHi;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return feignServiceHi.sayHiFromClientOne(name);
    }

}
