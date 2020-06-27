package com.dm.test;

import com.dm.insurance.dao.InsuranceCarInsurDao;
import com.dm.insurance.entity.InsuranceCarInsur;
import com.dm.insurance.service.InsuranceCarInsurService;
import com.dm.insurance.service.impl.InsuranceCarInsurServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ProjectName: insurance
 * @ClassName: CarTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: WD
 * @Date: 2020/6/27 9:43
 */
@SpringBootTest(classes = InsuranceCarInsur.class)
@Slf4j
public class CarTest {
    @Resource
   private InsuranceCarInsurService service;
    @Test
    public void test1() {
        log.info(service.queryAllByLimit(0,11).toString());
    }
}
