package com.dm.insurance.controller;

import com.dm.insurance.service.Order2Service;
import com.dm.insurance.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create By WeiBin on 2020/6/23 22:30
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private Order2Service orde2rService;

    @RequestMapping("/order/test")
    public String test1() {
        String s = orderService.testUser();
        System.out.println("服务端调用的内容" + s);
        return "调用成功111";
    }

    @RequestMapping("/order/test1")
    public String test12() {
        String s = orde2rService.testUser();
        System.out.println("服务端调用的内容" + s);
        return "调用成功";
    }
}
