package com.okguo.produce.domain;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/01 09:47
 */
public class Author {

    private Integer id;
    private String name;
    private String email;
    private String education;

    public Integer getId() {
        return id;
    }

    public Author setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Author setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public Author setEducation(String education) {
        this.education = education;
        return this;
    }
}
