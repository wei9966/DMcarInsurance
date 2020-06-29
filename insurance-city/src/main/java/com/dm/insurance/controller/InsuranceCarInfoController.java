package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceCarInfo;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceCarInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 车辆信息表(InsuranceCarInfo)表控制层
 *
 * @author makejava
 * @since 2020-06-29 12:51:43
 */
@RestController
@RequestMapping("/insuranceCity/insuranceCarInfo")
public class InsuranceCarInfoController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceCarInfoService insuranceCarInfoService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceCarInfo selectOne(Integer id) {
        return this.insuranceCarInfoService.queryById(id);
    }

    @PostMapping("selectOne2")
    public R selectOne2(@RequestBody InsuranceCarInfo insuranceCarInfo) {
        return R.ok().put("data",this.insuranceCarInfoService.insert(insuranceCarInfo));
    }
}