package com.github.cumtfc.demo.feign;

import org.springframework.stereotype.Component;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
@Component
public class FeignServiceHiHystrix implements FeignServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
