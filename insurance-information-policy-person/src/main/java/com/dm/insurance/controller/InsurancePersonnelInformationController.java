package com.dm.insurance.controller;

import com.dm.insurance.entity.InsurancePersonnelInformation;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsurancePersonnelInformationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (InsurancePersonnelInformation)表控制层
 *
 * @author wb
 * @since 2020-07-13 09:14:04
 */
@RestController
@RequestMapping("policy/insurancePersonnelInformation")
public class InsurancePersonnelInformationController {
    /**
     * 服务对象
     */
    @Resource
    private InsurancePersonnelInformationService insurancePersonnelInformationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsurancePersonnelInformation selectOne(Integer id) {
        return this.insurancePersonnelInformationService.queryById(id);
    }

    @PostMapping("insert")
    public R insert(@RequestBody InsurancePersonnelInformation insurancePersonnelInformation){
        return R.ok().put("data",this.insurancePersonnelInformationService.insert(insurancePersonnelInformation));
    }
}