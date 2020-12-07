package com.okguo.service;

import com.okguo.producer.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:05
 */
@Service
public class ProductService {

    static List<Product> products = new ArrayList<Product>();

    static {
        Product product1 = new Product().setId(1001).setName("商品1001").setDescription("商品1001的描述").setProductionDate(new Date());
        Product product2 = new Product().setId(1002).setName("商品1002").setDescription("商品1002的描述").setProductionDate(new Date());
        Product product3 = new Product().setId(1003).setName("商品1003").setDescription("商品1003的描述").setProductionDate(new Date());
        Product product4 = new Product().setId(1004).setName("商品1004").setDescription("商品1004的描述").setProductionDate(new Date());
        Product product5 = new Product().setId(1005).setName("商品1005").setDescription("商品1005的描述").setProductionDate(new Date());
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }


    public Product queryById(Integer id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return new Product();
    }
}
