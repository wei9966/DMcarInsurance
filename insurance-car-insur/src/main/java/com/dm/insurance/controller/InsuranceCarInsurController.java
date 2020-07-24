package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceCarInsur;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceCarInsurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 保险信息表(InsuranceCarInsur)表控制层
 *
 * @author makejava
 * @since 2020-06-24 16:35:46
 */
@Slf4j
@RestController
@RequestMapping("/carInsur/insur")
public class InsuranceCarInsurController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceCarInsurService insuranceCarInsurService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/selectOne")
    public InsuranceCarInsur selectOne(Integer id) {
        return this.insuranceCarInsurService.queryById(id);
    }

    @RequestMapping("/selectAllType")
    public R queryAllType(@RequestParam("ciType") String ciType,
                          @RequestParam("ciState") Integer ciState) {

        List<InsuranceCarInsur> insuranceCarInsurs = insuranceCarInsurService.queryAllType(ciType, ciState);
        return R.ok().put("data", insuranceCarInsurs);
    }

}