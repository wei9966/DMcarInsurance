package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceClause;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceClauseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (InsuranceClause)表控制层
 *
 * @author makejava
 * @since 2020-06-26 13:36:54
 */
@RestController
@RequestMapping("policy/insuranceClause")
@Slf4j
public class InsuranceClauseController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceClauseService insuranceClauseService;

    /**
     * 查询所有条款
     *
     * @return 单条数据
     */
    @GetMapping("select")
    public R selectOne() {
        return R.ok().put("data", insuranceClauseService.queryAllByLimit(0, 10));
    }


}