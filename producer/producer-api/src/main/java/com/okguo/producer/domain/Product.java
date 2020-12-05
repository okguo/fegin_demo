package com.okguo.producer.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/05 17:00
 */
@Data
public class Product {

    private Integer id;

    private String name;

    private String description;

    private Date productionDate;

    public Product setId(Integer id) {
        this.id = id;
        return this;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public Product setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
        return this;
    }
}
