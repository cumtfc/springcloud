package com.github.cumtfc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author fc751
 */
@EnableCircuitBreaker
@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.github.cumtfc.demo.feign"})
@SpringBootApplication(scanBasePackages = {"com.github.cumtfc.demo.service", "com.github.cumtfc.demo.feign",
    "com.github.cumtfc.demo.controller"})
public class ServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
