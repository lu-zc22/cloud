package com.luzck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 支付模块启动类-Zookeeper
 EnableDiscoveryClient 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 @author luzc
 @since 2020/4/23 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment4Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment4Application.class, args);
    }

}
