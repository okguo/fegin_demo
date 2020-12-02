package com.okguo.produce.service.impl;

import com.alibaba.fastjson.JSON;
import com.okguo.produce.domain.Author;
import com.okguo.produce.service.AuthorService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/01 09:46
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Override
    public Author getAuthorInfo() {
        Author author = new Author().setId(1001).setName("Edition").setEmail("123@qq.com").setEducation("college");
        System.out.println("服务生产者生产：" + JSON.toJSONString(author));
        return author;
    }
}
