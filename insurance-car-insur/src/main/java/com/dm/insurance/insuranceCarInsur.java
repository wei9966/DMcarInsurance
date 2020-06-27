package com.dm.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: insurance
 * @ClassName: insuranceCarInsur
 * @Description: TODO(一句话描述该类的功能)
 * @Author: WD
 * @Date: 2020/6/24 16:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class insuranceCarInsur {

    public static void main(String[] args) {
        SpringApplication.run(insuranceCarInsur.class,args);
    }
}
