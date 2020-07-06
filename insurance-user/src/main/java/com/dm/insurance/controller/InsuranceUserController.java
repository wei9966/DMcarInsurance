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
@RequestMapping("user/insuranceUser")
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
    public R selectOne(Integer id) {
        InsuranceUser insuranceUser = this.insuranceUserService.queryById(id);
        return R.ok().put("data",insuranceUser);
    }


    /**
     * 新增用户数据
     *
     * @param insuranceuser 对象
     * @return 是否登录成功
     * */
    @RequestMapping("/insert")
    public R insert(@RequestBody InsuranceUser insuranceuser){

        InsuranceUser insert = this.insuranceUserService.insert(insuranceuser);

            return R.ok().put("data",insert);

    }

    /**
     * 更新用户数据
     *
     * @param insuranceuser 对象
     * @return 是否登录成功
     * */
    @RequestMapping("/update")
    public R update(@RequestBody InsuranceUser insuranceuser){
        InsuranceUser update = this.insuranceUserService.update(insuranceuser);
        if (update!=null){
            return R.ok();
        }else {
            return R.error().put("msg","连接服务器超时，请稍后重试");
        }
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
     * @param userPass
     * @param userEmail
     * @return 是否登录成功
     * */
    @RequestMapping("/emailLogin")
    public R emailLogin(String userEmail,String userPass){
        InsuranceUser insuranceUser = this.insuranceUserService.emailLogin(userEmail, userPass);
        if (insuranceUser!=null){
            return R.ok();
        }else {
            return R.error().put("msg","登录失败");
        }
    }

    /**
     *
     *
     * @param userPhone
     * @return
     * */
    @RequestMapping("/queryPhone")
    public R queryPhone(String userPhone){
        InsuranceUser insuranceUser = this.insuranceUserService.queryPhone(userPhone);
        if (insuranceUser!=null){
            return R.ok();
        }else {
            return R.error().put("msg","已存在该手机号");
        }
    }

    /**
     * 查询账号
     *
     * @param userPhone
     * @param userEmail
     * @param userName
     * @return ID
     * */
        @RequestMapping("/queryId")
    public R queryId(String userPhone,String userEmail,String userName){
        InsuranceUser queryId = this.insuranceUserService.queryId(userPhone,userEmail,userName);
        if (queryId!=null){
            return R.ok().put("data",queryId);
        }else {
            return R.error().put("data",0);
        }

    }

}