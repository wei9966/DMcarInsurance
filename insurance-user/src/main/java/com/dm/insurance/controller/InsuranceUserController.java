package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(InsuranceUser)表控制层
 *
 * @author makejava
 * @since 2020-06-24 17:51:48
 */
@RestController
@RequestMapping("insuranceUser")
public class InsuranceUserController {
    /**
     * 服务对象
     */
    @Resource
    private InsuranceUserService insuranceUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InsuranceUser selectOne(Integer id) {
        return this.insuranceUserService.queryById(id);
    }

    /**
     * 通过手机号验证码登录
     *
     * @param userPhone
     * @return 是否登录成功
     * */
    @RequestMapping("/phoneCodeLogin")
    public R phoneCodeLogin(String userPhone){
        InsuranceUser insuranceUser = this.insuranceUserService.phoneCodeLogin(userPhone);
        if (insuranceUser!=null){
            return R.ok();
        }else {
            return R.error().put("msg","用户名密码错误");
        }
    }

    /**
     * 通过手机号登录
     *
     * @param userPhone
     * @param userPass
     * @return 是否登录成功
     * */
    @RequestMapping("/phoneLogin")
    public R phoneLogin(String userPhone,String userPass){
        InsuranceUser insuranceUser = this.insuranceUserService.phoneLogin(userPhone, userPass);
        if (insuranceUser!=null){
            return R.ok();
        }else {
            return R.error().put("msg","用户名密码错误");
        }
    }

    /**
     * 通过用户名登录
     *
     * @param userName
     * @param userPass
     * @return 是否登录成功
     * */
    @RequestMapping("/nameLogin")
    public R nameLogin(String userName,String userPass){
        InsuranceUser insuranceUser = this.insuranceUserService.nameLogin(userName, userPass);
        if (insuranceUser!=null){
            return R.ok();
        }else {
            return R.error().put("msg","用户名密码错误");
        }
    }

    /**
     * 通过邮箱登录
     *
     * @param userEmail
     * @param userPass
     * @return 是否登录成功
     * */
    @RequestMapping("/emailLogin")
    public R emailLogin(String userEmail,String userPass){
        InsuranceUser insuranceUser = this.insuranceUserService.emailLogin(userEmail, userPass);
        if (insuranceUser!=null){
            return R.ok();
        }else {
            return R.error().put("msg","用户名密码错误");
        }
    }

}