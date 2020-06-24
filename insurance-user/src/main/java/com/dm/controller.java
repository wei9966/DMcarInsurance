package com.dm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: insurance
 * @ClassName: controller
 * @Description: TODO(一句话描述该类的功能)
 * @Author: WD
 * @Date: 2020/6/23 22:29
 */
@RestController
public class controller {

    @GetMapping("/user")
    public String test(){
        System.out.println("111");
        return "你好呀!";
    }
}
