package com.tobeng.dubbo.producer.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import com.tobeng.dubbo.producer.service.OrderService;

/**
 * 订单实现类
 *
 * @author yaorui
 * @date 2019-10-09 10:04
 **/
@Component
@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public String getOrderMessage(String id) {
        String message = "查询订单信息：" + id;
        return message;
    }
}
