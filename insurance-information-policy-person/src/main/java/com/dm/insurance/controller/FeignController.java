package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.entity.R;
import com.dm.insurance.feign.MyFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By WeiBin on 2020/7/4 17:06
 * @author WB
 */
@RestController
@RequestMapping("policy/feign")
public class FeignController {

    private final MyFeignClients feignClients;

    @Autowired
    public FeignController(MyFeignClients feignClients) {
        this.feignClients = feignClients;
    }

    @RequestMapping("user/update")
    public R update(@RequestBody InsuranceUser user){
        System.out.println(user);
        return feignClients.update(user);
    }
}
