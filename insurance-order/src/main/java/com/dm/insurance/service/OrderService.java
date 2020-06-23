package com.dm.insurance.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By WeiBin on 2020/6/23 22:30
 * @author WB
 */
@Component
@FeignClient(value = "insurance-user-wb")
public interface OrderService {

    @GetMapping("/user")
    String  testUser();
}
