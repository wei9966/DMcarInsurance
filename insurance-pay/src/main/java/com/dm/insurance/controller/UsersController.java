package com.dm.insurance.controller;

import com.alipay.api.AlipayApiException;
import com.dm.insurance.config.AlipayTemplate;
import com.dm.insurance.vo.PayVo;
import com.dm.insurance.config.AlipayTemplate;
import com.dm.insurance.vo.PayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/insurance/pay")
public class UsersController {
    @Autowired
    AlipayTemplate alipayTemplate;

    @RequestMapping("/index")
    public String toIndex() {
        PayVo payVo = new PayVo();
        String Str1 = UUID.randomUUID().toString().replace("-", "");
        payVo.setOut_trade_no(Str1);
        System.out.println(payVo.getOut_trade_no());
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/payorder", produces = "text/html", method = RequestMethod.POST)
    public String pay(@RequestParam("outtradeno") String outtradeno,
                      @RequestParam("totalamount") String totalamount
    ) throws AlipayApiException {
        System.out.println(totalamount);
        System.out.println(outtradeno);
        PayVo payVo = new PayVo();
        payVo.setOut_trade_no(outtradeno);
        payVo.setTotal_amount(totalamount);
        payVo.setBody("");
        payVo.setSubject("测试");
        String pay = alipayTemplate.pay(payVo);
        // System.out.println(payVo);
//        System.out.println("11");

//        String Str1=UUID.randomUUID().toString().replace("-", "");
//
//
//                payVo.setOut_trade_no(Str1);
//
//        System.out.println(payVo.getOut_trade_no());
//                payVo.setTotal_amount("100");
//               payVo.setBody("熊大");
//               payVo.setSubject("熊二");
//
//        payVo.setBody("熊大");
//        System.out.println(pay);
        return pay;
    }
}
