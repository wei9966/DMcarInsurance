package com.dm.insurance.controller;

import com.alibaba.fastjson.JSON;
import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceInsurContractService;
import com.dm.insurance.util.InsuranceDateUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 保单表(InsuranceInsurContract)表控制层
 *
 * @author wb
 * @since 2020-07-21 14:21:33
 */
@RestController
@RequestMapping("policy/insuranceInsurContract")
public class InsuranceInsurContractController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceInsurContractService insuranceInsurContractService;
    /**
     * redis模板
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;
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

    /**
     * 新增数据
     * @param insuranceInsurContract
     * @return 新增后的数据
     */
    @GetMapping("insertOne")
    public R insertOne(@RequestBody InsuranceInsurContract insuranceInsurContract) {
        InsuranceInsurContract insert = this.insuranceInsurContractService.insert(insuranceInsurContract);
        return R.ok().put("data",insert);
    }

    /**
     * 将投保单数据添加到redis
     * @param insuranceInsurContract 投保单
     * @return 是否存入成功
     */
    @PostMapping("/add/contract")
    public R addContractRedis(@RequestBody InsuranceInsurContract insuranceInsurContract){
        stringRedisTemplate.opsForValue().set(insuranceInsurContract.getCiId(),JSON.toJSONString(insuranceInsurContract),24,TimeUnit.HOURS);
        System.out.println("存入的键"+insuranceInsurContract.getCiId()+"\t值"+JSON.toJSONString(insuranceInsurContract));
        return  R.ok().put("data",insuranceInsurContract);
    }

    /**
     * 将投保单从缓存中拿出来，并且存入到数据库中
     * @param redisKey 缓存中的键
     * @return 返回存入后的结果
     */
    @GetMapping("/get/contract/{orderId}")
    public R getContractByRedis(@PathVariable("orderId") String redisKey){
        String rs = stringRedisTemplate.opsForValue().get(redisKey);
        InsuranceInsurContract insuranceInsurContract = JSON.parseObject(rs, InsuranceInsurContract.class);
        // TODO 保存到数据库中,生成两个时间类,一个开始时间，一个结束时间,同时将此条信息的订单支付状态更改
        insuranceInsurContract.setIcAddtime(InsuranceDateUtils.getNowDate());
        insuranceInsurContract.setIcTotime(InsuranceDateUtils.getToDate());
        System.out.println("查到的值"+insuranceInsurContract);
        InsuranceInsurContract insert = this.insuranceInsurContractService.insert(insuranceInsurContract);
        stringRedisTemplate.opsForValue().set(redisKey,"",1,TimeUnit.SECONDS);
        System.out.println("增加后的值"+insert);
        return R.ok().put("data",insert);
    }
}