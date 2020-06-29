package com.dm.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: ZLY
 * @Date: 2020/6/28 09:07
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CarInfoSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarInfoSpringBootApplication.class,args);
    }
}
