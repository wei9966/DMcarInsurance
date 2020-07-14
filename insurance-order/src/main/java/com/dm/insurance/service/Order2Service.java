package com.dm.insurance.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Create By WeiBin on 2020/6/23 22:49
 */
@Component
@FeignClient(value = "insurance-user")
public interface Order2Service {
    @GetMapping("/user")
    String testUser();
}
