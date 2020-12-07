package com.okguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 */
@SpringBootApplication
@Configuration
@EnableEurekaClient
@EnableFeignClients
public class ConsumerProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerProviderApplication.class);
    }
}
