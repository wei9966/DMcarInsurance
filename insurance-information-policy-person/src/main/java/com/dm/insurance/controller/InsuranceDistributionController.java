package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceDistribution;
import com.dm.insurance.service.InsuranceDistributionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 配送表(InsuranceDistribution)表控制层
 *
 * @author makejava
 * @since 2020-06-26 13:36:38
 */
@RestController
@RequestMapping("policy/insuranceDistribution")
public class InsuranceDistributionController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceDistributionService insuranceDistributionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceDistribution selectOne(Integer id) {
        return this.insuranceDistributionService.queryById(id);
    }

}