package com.turato.test;

import lombok.Data;

/**
 * @author tuhao
 * @date 2021/3/2 3:51 下午
 * @desc
 */
@Data
public class OrderBO {
    String orderId;
    String buyerId;
    String productName;
    String price;
}
