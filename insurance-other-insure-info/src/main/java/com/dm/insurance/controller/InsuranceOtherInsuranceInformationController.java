package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceOtherInsuranceInformation;
import com.dm.insurance.service.InsuranceOtherInsuranceInformationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (InsuranceOtherInsuranceInformation)表控制层
 *
 * @author makejava
 * @since 2020-06-24 16:13:13
 */
@RestController
//@RequestMapping("insuranceOtherInsuranceInformation")
public class InsuranceOtherInsuranceInformationController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceOtherInsuranceInformationService insuranceOtherInsuranceInformationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceOtherInsuranceInformation selectOne(Integer id) {
        return this.insuranceOtherInsuranceInformationService.queryById(id);
    }

    @GetMapping("/test")
    public String test(){
        return "123";
    }

}