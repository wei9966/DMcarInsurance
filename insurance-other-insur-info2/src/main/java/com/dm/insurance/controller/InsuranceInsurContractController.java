package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceInsurContractService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 保单表(InsuranceInsurContract)表控制层
 *
 * @author makejava
 * @since 2020-06-27 14:19:38
 */
@RestController
@RequestMapping("/otherInsur/info")
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

    /*
     * 通过保单表查询用户的基本信息
     *
     * */
    @GetMapping("/selectTwo")
    public R selectTwo(Integer id) {
        List<InsuranceUser> insuranceUserList = insuranceInsurContractService.selectByinfo(id);
        if (insuranceUserList == null || insuranceUserList.size() <= 0) {
            return R.error(10001, "沒有保单");
        } else {
            return R.ok().put("data", insuranceUserList);
        }
    }
}