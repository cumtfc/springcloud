package com.github.cumtfc.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author fc751
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.github.cumtfc.eureka.client.controller"})
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }
}
