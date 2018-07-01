package com.github.cumtfc.demo.feign;

import com.github.cumtfc.api.ServiceHi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
@FeignClient(value = "service-hi")
public interface FeignServiceHi extends ServiceHi {

}
