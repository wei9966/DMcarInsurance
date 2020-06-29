package com.dm.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: ZLY
 * @Date: 2020/6/27 14:36
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OtherSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(OtherSpringBootApplication.class,args);
    }
}
