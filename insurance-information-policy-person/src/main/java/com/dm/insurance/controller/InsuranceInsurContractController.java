package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceInsurContractService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 保单表(InsuranceInsurContract)表控制层
 *
 * @author wb
 * @since 2020-07-21 14:21:33
 */
@RestController
@RequestMapping("insuranceInsurContract")
public class InsuranceInsurContractController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceInsurContractService insuranceInsurContractService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceInsurContract selectOne(Integer id) {

        return this.insuranceInsurContractService.queryById(id);
    }

    /**
     * 新增数据
     * @param insuranceInsurContract
     * @return 新增后的数据
     */
    @GetMapping("selectOne")
    public R insertOne(@RequestBody InsuranceInsurContract insuranceInsurContract) {
        InsuranceInsurContract insert = this.insuranceInsurContractService.insert(insuranceInsurContract);
        return R.ok().put("data",insert);
    }

}