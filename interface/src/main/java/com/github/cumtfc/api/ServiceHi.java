package com.github.cumtfc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public interface ServiceHi {

    /**
     * service-hi 提供的webservice
     *
     * @param name 姓名参数
     * @return service-hi的返回值
     */
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
