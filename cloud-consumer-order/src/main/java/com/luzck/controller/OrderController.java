package com.luzck.controller;

import com.luzck.model.entity.Payment;
import com.luzck.model.response.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 @author Luzc
 @since 2020/4/25 */
@RestController
@Slf4j
@RequestMapping("/consument/payment")
public class OrderController {

    // private static final String PAYMENT_URL = "http://localhost:8001";

    //通过在eureka上注册过的微服务名称调用
    private static final String PAYMENT_URL = "http://CLOUD-PROVIDER-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult add(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, CommonResult.class);
    }

    @GetMapping("/getById/{id}")
    public CommonResult getById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getById/" + id, CommonResult.class);
    }

}
