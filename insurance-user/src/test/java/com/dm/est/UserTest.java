package com.dm.est;

import com.dm.insurance.UserSpringBootApplication;
import com.dm.insurance.dao.InsuranceUserDao;
import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.service.InsuranceUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = UserSpringBootApplication.class)
public class UserTest {
    @Autowired
    private InsuranceUserService insuranceUserService;
    @Test
    public void test1(){

//        InsuranceUser admin = InsuranceUserService.phoneLogin(45645789, "admin");
        InsuranceUser insuranceUser = insuranceUserService.queryById(1);
        System.out.println(insuranceUserService.queryAllByLimit(0,10).toString());
    }
}
