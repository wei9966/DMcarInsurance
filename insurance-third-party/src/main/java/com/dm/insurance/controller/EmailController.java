package com.dm.insurance.controller;

import com.dm.insurance.entity.R;
import com.dm.insurance.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Create By WeiBin on 2020/6/26 23:18
 *
 * @author WB
 */
@RequestMapping("third/email")
@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/send/{to}")
    public R sendEmail(@PathVariable("to") String to) {
        String checkCode = String.valueOf(new Random().nextInt(899990) + 100000);
        String message = "<br>您的注册码为:" + checkCode + "为确保您的账户安全,验证码不要随意发送给他人。";
        emailService.sendEmail("注册验证码", to, message);
        return R.ok().put("data", checkCode);
    }

}
