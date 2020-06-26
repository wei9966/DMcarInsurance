package com.dm.insurance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Create By WeiBin on 2020/6/26 13:31
 *
 * @author WB
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.dm.insurance.dao")
public class PolicyPersonInformation {
    public static void main(String[] args) {
        SpringApplication.run(PolicyPersonInformation.class, args);
    }
}
