package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceLogin;
import com.dm.insurance.service.InsuranceLoginService;
import com.dm.insurance.util.ResultUtil;
import com.dm.insurance.util.TokenUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create By WeiBin on 2020/7/24 14:06
 * @author WB
 */
@RestController
@RequestMapping("/user/loginUser")
public class UserLoginController {
    @Resource
    private InsuranceLoginService insuranceLoginService;
    @PostMapping("/login")
    public ResultUtil login(String userName, String userPass){
        InsuranceLogin insuranceUser = insuranceLoginService.queryName(userName, userPass);
        if (insuranceUser == null) {
            return ResultUtil.failure().addObject("err", "用户名或密码错误!");
        }
        //获取token
        String token = TokenUtil.getToken(insuranceUser);
        //返回给客户端保存
        return ResultUtil.success().addObject("token", token).addObject("user",insuranceUser);
    }
    /**
     * 通过手机号验证码登录
     *
     * @param userPhone
     * @return 是否登录成功
     */
    @RequestMapping("/phoneCodeLogin")
    public ResultUtil phoneCodeLogin(String userPhone) {
        InsuranceLogin insuranceUser = this.insuranceLoginService.phoneCodeLogin(userPhone);
        if (insuranceUser == null) {
            return ResultUtil.failure().addObject("err", "用户名或密码错误!");
        }
        //获取token
        String token = TokenUtil.getToken(insuranceUser);
        //返回给客户端保存
        return ResultUtil.success().addObject("token", token).addObject("user",insuranceUser);
    }

    /**
     * 通过手机号登录
     *
     * @param userPhone
     * @param userPass
     * @return 是否登录成功
     */
    @RequestMapping("/phoneLogin")
    public ResultUtil phoneLogin(String userPhone, String userPass) {
        InsuranceLogin insuranceUser = this.insuranceLoginService.phoneLogin(userPhone, userPass);
        if (insuranceUser == null) {
            return ResultUtil.failure().addObject("err", "用户名或密码错误!");
        }
        //获取token
        String token = TokenUtil.getToken(insuranceUser);
        //返回给客户端保存
        return ResultUtil.success().addObject("token", token).addObject("user",insuranceUser);
    }

    /**
     * 通过用户名登录
     *
     * @param userName
     * @param userPass
     * @return 是否登录成功
     */
    @RequestMapping("/nameLogin")
    public ResultUtil nameLogin(String userName, String userPass) {
        InsuranceLogin insuranceUser = this.insuranceLoginService.nameLogin(userName, userPass);
        if (insuranceUser == null) {
            return ResultUtil.failure().addObject("err", "用户名或密码错误!");
        }
        //获取token
        String token = TokenUtil.getToken(insuranceUser);
        //返回给客户端保存
        return ResultUtil.success().addObject("token", token).addObject("user",insuranceUser);
    }

    /**
     * 通过邮箱登录
     *
     * @param userPass
     * @param userEmail
     * @return 是否登录成功
     */
    @RequestMapping("/emailLogin")
    public ResultUtil emailLogin(String userEmail, String userPass) {
        InsuranceLogin insuranceUser = this.insuranceLoginService.emailLogin(userEmail, userPass);
        if (insuranceUser == null) {
            return ResultUtil.failure().addObject("err", "用户名或密码错误!");
        }
        //获取token
        String token = TokenUtil.getToken(insuranceUser);
        //返回给客户端保存
        return ResultUtil.success().addObject("token", token).addObject("user",insuranceUser);
    }
}
