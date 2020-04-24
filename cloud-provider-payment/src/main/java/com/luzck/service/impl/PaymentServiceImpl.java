package com.luzck.service.impl;

import com.luzck.dao.PaymentMapper;
import com.luzck.model.entity.Payment;
import com.luzck.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 @author luzc
 @since 2020/4/23 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int add(Payment payment) {
        return paymentMapper.add(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentMapper.getById(id);
    }

}
