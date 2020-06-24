package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceCity;
import com.dm.insurance.service.InsuranceCityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 统一地区库(InsuranceCity)表控制层
 *
 * @author makejava
 * @since 2020-06-24 16:23:33
 */
@RestController
@RequestMapping("insuranceCity")
public class InsuranceCityController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceCityService insuranceCityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceCity selectOne(Integer id) {

        return this.insuranceCityService.queryById(id);
    }

}