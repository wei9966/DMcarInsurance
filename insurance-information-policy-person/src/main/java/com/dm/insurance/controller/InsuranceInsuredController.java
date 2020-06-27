package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceInsured;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceInsuredService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 被保险人表(InsuranceInsured)表控制层
 *
 * @author makejava
 * @since 2020-06-26 13:35:35
 */
@RestController
@RequestMapping("policy/insuranceInsured")
public class InsuranceInsuredController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceInsuredService insuranceInsuredService;

    /**
     * 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceInsured selectOne(Integer id) {
        return this.insuranceInsuredService.queryById(id);
    }

    @PostMapping("insertOne")
    public R insertOne(@RequestBody InsuranceInsured insuranceInsured){
        InsuranceInsured insert = insuranceInsuredService.insert(insuranceInsured);
        return R.ok().put("data",insert);
    }
}