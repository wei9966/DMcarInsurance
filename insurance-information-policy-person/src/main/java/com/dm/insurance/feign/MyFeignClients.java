package com.dm.insurance.feign;

import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.entity.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By WeiBin on 2020/7/4 17:03
 * @author WB
 */
@Component
@FeignClient(value = "insurance-user")
public interface MyFeignClients {

    @RequestMapping("user/insuranceUser/update")
    public R update(@RequestBody InsuranceUser user);


}
