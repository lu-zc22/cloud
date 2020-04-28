package com.luzck.controller;

import com.luzck.model.response.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 @author Luzc
 @since 2020/4/25 */
@RestController
@Slf4j
@RequestMapping("/consument/payment")
public class OrderZkController {

    //通过在eureka上注册过的微服务名称调用
    private static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/zk")
    public CommonResult paymentzk() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", CommonResult.class);
    }

}
