package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceCity;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceCityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 统一地区库(InsuranceCity)表控制层
 *
 * @author makejava
 * @since 2020-06-24 16:23:33
 */
@RestController
@RequestMapping("/insuranceCity/insuranceCity")
public class InsuranceCityController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceCityService insuranceCityService;

    /**
     * 通过主键查询单条数据
     *
     * @param parentid
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceCity selectOne(Integer parentid) {
        return this.insuranceCityService.queryById(parentid);
    }

    @GetMapping("selectOne2")
    public R selectOne2(Integer parentid) {
        List<InsuranceCity> list = this.insuranceCityService.ListqueryById(parentid);
        return R.ok().put("data",list);
    }
}