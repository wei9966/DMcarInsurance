package com.dm.insurance.controller;

import com.dm.insurance.entity.R;
import com.dm.insurance.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/send")
    public R sendEmail(String title, String to, String content) {
        emailService.sendEmail(title, to, content);
        return R.ok();
    }

}
