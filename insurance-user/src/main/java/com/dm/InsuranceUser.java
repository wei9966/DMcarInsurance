package com.dm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: insurance
 * @ClassName: InsuranceUser
 * @Description: TODO(一句话描述该类的功能)
 * @Author: WD
 * @Date: 2020/6/23 21:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class InsuranceUser {
    public static void main(String[] args) {
        SpringApplication.run(InsuranceUser.class, args);
    }
}
