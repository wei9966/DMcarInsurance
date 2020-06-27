package com.dm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create By WeiBin on 2020/6/24 16:30
 * @author WB
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class GateWaySpringBootApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(GateWaySpringBootApplication80.class, args);
    }
}
