package com.github.cumtfc.eureka.client.controller;

import com.github.cumtfc.api.ServiceHi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
@RestController
public class ControllerDemo implements ServiceHi {

    @Value("${server.port}")
    String port;

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
