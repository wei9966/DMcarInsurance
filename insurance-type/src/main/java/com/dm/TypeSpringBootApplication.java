package com.dm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create By WeiBin on 2020/6/24 14:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TypeSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TypeSpringBootApplication.class,args);
    }
}
