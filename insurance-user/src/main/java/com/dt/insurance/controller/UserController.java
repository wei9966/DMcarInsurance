package com.dt.insurance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By WeiBin on 2020/6/23 22:46
 */
@RestController
public class UserController {
    @RequestMapping("/user")
    public String test(){
        return "我是user服务";
    }
}