package com.luzck.dao;

import com.luzck.model.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 @author luzc
 @since 2020/4/23 */
@Mapper
public interface PaymentMapper {

    int add(Payment payment);

    Payment getById(@Param("id") Long id);

}
