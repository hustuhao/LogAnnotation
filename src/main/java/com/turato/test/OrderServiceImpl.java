package com.turato.test;

import com.turato.starter.annotation.LogRecordAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author tuhao
 * @date 2021/3/2 3:50 下午
 * @desc
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    //使用了自定义函数，主要是在 {{#orderId}} 的大括号中间加了 functionName
    @LogRecordAnnotation(success = "更新了订单ORDER{#orderId}},更新内容为...",
            prefix = "turato.createOrder", bizNo = "{{#orderBO.orderId}}",
            detail = "{{#orderBO.toString()}}")
    @Override
    public Boolean createOrder(OrderBO orderBO) {
        return true;
    }
}
