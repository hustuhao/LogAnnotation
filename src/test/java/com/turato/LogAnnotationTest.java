package com.turato;

import com.turato.test.OrderBO;
import com.turato.test.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author tuhao
 * @date 2021/3/2 3:26 下午
 * @desc
 */
@Slf4j
public class LogAnnotationTest extends BaseTest {
    @Resource
    private OrderService orderService;

    @Test
    public void testAnnotation() {
        OrderBO orderBO = new OrderBO();
        orderBO.setOrderId("TAOBAO10086");
        orderBO.setPrice("999.99$");
        orderBO.setProductName("二手苹果手机");
        orderBO.setBuyerId("10086");
        Boolean flag = orderService.createOrder(orderBO);
        Assert.assertTrue(flag);

    }

}
