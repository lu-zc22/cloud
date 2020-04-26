package com.luzck.controller;

import com.luzck.model.entity.Payment;
import com.luzck.model.response.CommonResult;
import lombok.extern.slf4j.Slf4j;
import com.luzck.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 @author luzc
 @since 2020/4/23 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("*****插入结果：" + result);
        return result > 0 ? new CommonResult<>(200, "插入数据成功！serverPort:" + serverPort, result) : new CommonResult<>(444, "插入数据失败！");
    }

    @GetMapping("/getById/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        log.info("*****插入结果：" + payment);
        return new CommonResult<>(200, "查询成功！serverPort:" + serverPort, payment);
    }

}
