package com.okguo.consumer;

import lombok.Data;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:18
 */
@Data
public class Order {

    private Integer id;

    private String orderNo;

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    public Order setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    public Order setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public Order setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }

    private Integer productId;

    private String payTime;

}
