package com.okguo.controller;

import com.okguo.service.OrderService;
import com.okguo.vo.OrderInfoVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:16
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/{id}")
    public OrderInfoVO queryOrderInfo(@PathVariable Integer id){
        return orderService.queryOrderById(id);
    }

}
