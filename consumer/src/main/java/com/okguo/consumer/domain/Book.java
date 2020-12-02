package com.okguo.consumer.domain;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/11/30 17:34
 */
public class Book {

    private Integer id;
    private String name;
    private String company;
    private Double price;
    private Integer pages;

    public Integer getId() {
        return id;
    }

    public Book setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Book setCompany(String company) {
        this.company = company;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Book setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public Book setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
}
