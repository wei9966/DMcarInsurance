package com.dm.insurance.controller;

import com.alibaba.fastjson.JSON;
import com.dm.insurance.annotation.CurrentOperator;
import com.dm.insurance.entity.InsuranceLogin;
import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceLoginService;
import com.dm.insurance.service.InsuranceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 用户表(InsuranceLogin)表控制层
 *
 * @author makejava
 * @since 2020-06-24 17:51:48
 */
@RestController
@RequestMapping("user/insuranceUser")
public class InsuranceLoginController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceLoginService insuranceLoginService;

    @Resource
    private InsuranceUserService insuranceUserService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public R selectOne(Integer id) {
        InsuranceLogin insuranceUser = this.insuranceLoginService.queryById(id);
        return R.ok().put("data", insuranceUser);
    }

    /**
     * 新增用户数据
     *
     * @param insuranceLogin 对象
     * @return 是否登录成功
     */
    @RequestMapping("/insert")
    public R insert(@RequestBody InsuranceLogin insuranceLogin) {

        InsuranceLogin insert = this.insuranceLoginService.insert(insuranceLogin);

        return R.ok().put("data", insert);

    }

    /**
     * 更新用户数据
     *
     * @param insuranceLogin 对象
     * @return 是否登录成功
     */
    @RequestMapping("/update")
    public R update(@RequestBody InsuranceLogin insuranceLogin) {
        InsuranceLogin update = this.insuranceLoginService.update(insuranceLogin);
        if (update != null) {
            return R.ok();
        } else {
            return R.error().put("msg", "连接服务器超时，请稍后重试");
        }
    }

    /**
     * @param userPhone
     * @return
     */
    @RequestMapping("/queryPhone")
    public R queryPhone(String userPhone) {
        InsuranceLogin insuranceUser = this.insuranceLoginService.queryPhone(userPhone);
        if (insuranceUser != null) {
            return R.ok();
        } else {
            return R.error().put("msg", "已存在该手机号");
        }
    }

    /**
     * 查询账号
     *
     * @param userPhone
     * @param userEmail
     * @param userName
     * @return ID
     */
    @RequestMapping("/queryId")
    public R queryId(String userPhone, String userEmail, String userName) {
        InsuranceLogin queryId = this.insuranceLoginService.queryId(userPhone, userEmail, userName);
        if (queryId != null) {
            return R.ok().put("data", queryId);
        } else {
            return R.error().put("data", 0);
        }

    }

    /**
     * 添加用户信息
     * @param insuranceUser 传进来的用户信息
     * @return 添加过后的用户信息
     */
    @PostMapping("/insertUser")
    public R insertUser(@RequestBody InsuranceUser insuranceUser){
        InsuranceUser insert = this.insuranceUserService.insert(insuranceUser);
        return  R.ok().put("data",insert);
    }

    /**
     * 根据id获取用户信息
     * @param id 用户id
     * @return 查询出来的用户
     */
    @GetMapping("/selectUser/{id}")
    public R selectUser(@PathVariable("id") Integer id){
        InsuranceUser insuranceUser = this.insuranceUserService.queryById(id);
        return  R.ok().put("data",insuranceUser);
    }

    @RequestMapping("/admin")
    public R testMethod(@CurrentOperator InsuranceLogin user){
        System.out.println("当前登录的用户"+user);
        return R.ok().put("user",user);
    }

    @RequestMapping("/redisInsert")
    public R insertRedis(@CurrentOperator InsuranceLogin user){
        String s = UUID.randomUUID().toString();
        stringRedisTemplate.opsForValue().set(s+user.getInsuranceLoginId(),JSON.toJSONString(user),5,TimeUnit.MINUTES);
        System.out.println("需要缓存的用户的id"+s+user.getInsuranceLoginId());
        return R.ok().put("key",s+user.getInsuranceLoginId());
    }
    @RequestMapping("/redisGet")
    public R getRedis(String redisKey){
        System.out.println("redisKey"+redisKey);
        System.out.println("获取缓存后的用户"+stringRedisTemplate.opsForValue().get(redisKey));
        Object parse = JSON.parse(stringRedisTemplate.opsForValue().get(redisKey));
        InsuranceLogin insuranceUser = JSON.parseObject(stringRedisTemplate.opsForValue().get(redisKey), InsuranceLogin.class);
        return R.ok().put("data",insuranceUser);
    }
}