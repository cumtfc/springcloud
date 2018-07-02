package com.github.cumtfc.demo;

import com.github.cumtfc.demo.feign.FeignServiceHi;
import com.github.cumtfc.demo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceConsumerApplicationTests {

    @Autowired
    HelloService helloService;

    @Autowired
    FeignServiceHi feignServiceHi;

    @Test
    public void testRibbon() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println(helloService.hiService("fc"));
            Thread.sleep(500);
        }

    }

    @Test
    public void testFeign() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println(feignServiceHi.sayHiFromClientOne("fc"));
            Thread.sleep(500);
        }

    }

}
