package com.dm.insurance.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.dm.insurance.entity.InsuranceCarInfo;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceCarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 车辆信息表(InsuranceCarInfo)表控制层
 *
 * @author makejava
 * @since 2020-06-29 12:51:43
 */
@RestController
@RequestMapping("/insuranceCity/insuranceCarInfo")
public class InsuranceCarInfoController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
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

    @PostMapping("insertOne")
    public R selectOne2(@RequestBody InsuranceCarInfo insuranceCarInfo) {
        stringRedisTemplate.opsForValue().set("insuranceCarInfo", JSON.toJSONString(insuranceCarInfo, SerializerFeature.DisableCircularReferenceDetect), 1, TimeUnit.DAYS);
//        return R.ok().put("data",this.insuranceCarInfoService.insert(insuranceCarInfo));
        return R.ok();
    }

    @GetMapping("getRedisCarInfo")
    public R selectTwo(String redsiKey){
        String s = stringRedisTemplate.opsForValue().get(redsiKey);
        InsuranceCarInfo insuranceCarInfo = JSON.parseObject(s, InsuranceCarInfo.class);
        return R.ok().put("data",insuranceCarInfo);
    }
}