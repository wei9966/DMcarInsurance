package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceInserInclude;
import com.dm.insurance.service.InsuranceInserIncludeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 套餐清单(InsuranceInserInclude)表控制层
 *
 * @author makejava
 * @since 2020-06-27 11:09:43
 */
@RestController
@RequestMapping("/insur/incloud")
public class InsuranceInserIncludeController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceInserIncludeService insuranceInserIncludeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceInserInclude selectOne(Integer id) {
        return this.insuranceInserIncludeService.queryById(id);
    }

}