package com.okguo.produce.service;

import com.okguo.produce.domain.Author;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description:
 * @Author: Guoyongfu
 * @Date: 2020/12/01 09:45
 */
@FeignClient(name = "AuthorService", value = "AuthorService")
public interface AuthorService {

    @PostMapping("/author/getAuthorInfo")
    Author getAuthorInfo();

}
