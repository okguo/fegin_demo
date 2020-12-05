package com.okguo.service;

import com.okguo.consumer.Order;
import com.okguo.producer.domain.Product;
import com.okguo.producer.rpc.ProductApi;
import com.okguo.vo.OrderInfoVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:16
 */
@Service
public class OrderService {

    static List<Order> orders;

    static {
        Order order1 = new Order().setId(9001).setProductId(1001).setOrderNo("o-9001").setPayTime("2020-02-05 17:26:13");
        Order order2 = new Order().setId(9002).setProductId(1003).setOrderNo("o-9002").setPayTime("2020-02-09 17:26:13");
        Order order3 = new Order().setId(9003).setProductId(1002).setOrderNo("o-9003").setPayTime("2020-02-01 17:26:13");
        Order order4 = new Order().setId(9004).setProductId(1004).setOrderNo("o-9004").setPayTime("2020-02-02 17:26:13");
        Order order5 = new Order().setId(9005).setProductId(1006).setOrderNo("o-9005").setPayTime("2020-02-08 17:26:13");
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
    }

    @Resource
    private ProductApi productApi;


    public OrderInfoVO queryOrderById(Integer id) {
        Order orderVO = new Order();
        Product product = new Product();
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                orderVO = order;
            }
        }
        if (orderVO.getProductId() != null) {
            product = productApi.queryById(orderVO.getProductId());
        }

        return new OrderInfoVO().setOrder(orderVO).setProduct(product);
    }
}
