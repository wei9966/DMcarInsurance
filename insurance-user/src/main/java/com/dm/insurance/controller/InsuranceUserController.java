package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.service.InsuranceUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(InsuranceUser)表控制层
 *
 * @author makejava
 * @since 2020-06-24 17:51:48
 */
@RestController
@RequestMapping("insuranceUser")
public class InsuranceUserController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceUserService insuranceUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceUser selectOne(Integer id) {
        return this.insuranceUserService.queryById(id);
    }

}