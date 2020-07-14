package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceDrivingLicense;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceDrivingLicenseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 行驶证车主表(InsuranceDrivingLicense)表控制层
 *
 * @author makejava
 * @since 2020-06-26 13:35:59
 */
@RestController
@RequestMapping("policy/insuranceDrivingLicense")
public class InsuranceDrivingLicenseController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceDrivingLicenseService insuranceDrivingLicenseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceDrivingLicense selectOne(Integer id) {
        return this.insuranceDrivingLicenseService.queryById(id);
    }

    @PostMapping("insertOne")
    public R insertDrivingLicense(@RequestBody InsuranceDrivingLicense insuranceDrivingLicense) {
        InsuranceDrivingLicense drivingLicense = insuranceDrivingLicenseService.insert(insuranceDrivingLicense);
        return R.ok().put("data", drivingLicense);
    }
}