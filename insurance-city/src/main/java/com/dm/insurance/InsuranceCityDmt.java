package com.dm.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InsuranceCityDmt {
    public static void main(String[] args) {
        SpringApplication.run(InsuranceCityDmt.class,args);
    }
}

