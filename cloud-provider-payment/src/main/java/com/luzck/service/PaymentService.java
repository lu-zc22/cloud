package com.luzck.service;

import com.luzck.model.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 @author luzc
 @since 2020/4/23 */
public interface PaymentService {

    int add(Payment payment);

    Payment getById(@Param("id") Long id);

}
