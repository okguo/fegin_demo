package com.okguo.vo;

import com.okguo.consumer.Order;
import com.okguo.producer.domain.Product;
import lombok.Data;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:18
 */
@Data
public class OrderInfoVO {

    private Order order;

    private Product product;

    public OrderInfoVO setOrder(Order order) {
        this.order = order;
        return this;
    }

    public OrderInfoVO setProduct(Product product) {
        this.product = product;
        return this;
    }
}
