package com.okguo.controller.rpc;

import com.okguo.producer.domain.Product;
import com.okguo.producer.rpc.ProductApi;
import com.okguo.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:33
 */
@RestController
public class ProductApiImpl implements ProductApi {

    @Resource
    private ProductService productService;

    @Override
    public Product queryById(Integer id) {
        return productService.queryById(id);
    }
}
