package com.luzck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 @author luzc
 @since 2020/4/24 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication.class, args);
    }
    
}
