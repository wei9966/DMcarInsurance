package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceEvaluation;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceEvaluationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (InsuranceEvaluation)表控制层
 *
 * @author wb
 * @since 2020-07-12 14:38:10
 */
@RestController
@RequestMapping("policy/insuranceEvaluation")
public class InsuranceEvaluationController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceEvaluationService insuranceEvaluationService;

    /**
     * 查询所有数据
     *
     * @return 单条数据
     */
    @GetMapping("select")
    public R selectOne() {
        return R.ok().put("data",this.insuranceEvaluationService.queryAllByLimit(0,100));
    }
}