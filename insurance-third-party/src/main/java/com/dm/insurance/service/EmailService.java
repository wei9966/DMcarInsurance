package com.dm.insurance.service;

import com.dm.insurance.entity.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By WeiBin on 2020/6/26 23:20
 * 邮箱服务
 *
 * @author WB
 */
@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/send")
    public void sendEmail(String title, String to, String content) {
        //邮箱消息
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("yijinghuanqqle9966@qq.com");
        message.setTo(to);
        message.setSubject(title);
        message.setText(content);
        javaMailSender.send(message);
    }
}
