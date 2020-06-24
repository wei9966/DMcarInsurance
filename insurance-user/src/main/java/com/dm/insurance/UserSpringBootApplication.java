package com.dm.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create By WeiBin on 2020/6/23 21:17
 * @author WB
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserSpringBootApplication.class,args);
    }
}
