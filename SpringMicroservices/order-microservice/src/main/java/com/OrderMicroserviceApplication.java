package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderMicroserviceApplication.class, args);
        System.out.println(" User Microservice up on port number 9393");
    }
}
