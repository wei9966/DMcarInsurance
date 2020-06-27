package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceBilling;
import com.dm.insurance.service.InsuranceBillingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 开票表(InsuranceBilling)表控制层
 *
 * @author makejava
 * @since 2020-06-26 13:36:20
 */
@RestController
@RequestMapping("policy/insuranceBilling")
public class InsuranceBillingController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceBillingService insuranceBillingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceBilling selectOne(Integer id) {
        return this.insuranceBillingService.queryById(id);
    }

}