package com.dm.insurance.controller;

import com.dm.insurance.entity.R;
import com.dm.insurance.service.MessageService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By WeiBin on 2020/7/3 14:18
 *
 * @author WB
 */
@RestController
@RequestMapping("/third/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/sendMessage")
    public R sendMessage(String phoneNumber) {
        messageService.SendMessage(phoneNumber);
        if (!StringUtils.isBlank(MessageService.pNumber)) {
            return R.ok().put("验证码", MessageService.pNumber);
        } else {
            return R.error("服务器繁忙，请稍后重试");
        }
    }
}
