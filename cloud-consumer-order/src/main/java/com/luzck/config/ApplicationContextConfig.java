package com.luzck.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 @author Luzc
 @since 2020/4/25 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced    //LoadBalanced注解开启RestTemplate负载均衡功能
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
