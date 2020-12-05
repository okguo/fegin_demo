package com.okguo.producer.rpc;

import com.okguo.producer.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:09
 */
@FeignClient(value = "productApi")
public interface ProductApi {

    @PostMapping("productApi/{id}")
    Product queryById(@PathVariable Integer id);
}
