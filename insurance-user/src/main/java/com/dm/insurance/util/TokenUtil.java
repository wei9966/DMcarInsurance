package com.dm.insurance.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.dm.insurance.entity.InsuranceUser;

import java.util.Date;

public class TokenUtil {

    //设置过期时间为1个小时
    private static final Long EXPIRE_TIME = Long.valueOf(630000);

    public static String getToken(InsuranceUser insuranceUser){
        String token="";
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + EXPIRE_TIME);
        token= JWT.create().withAudience(String.valueOf(insuranceUser.getUserId()))
                .withExpiresAt(date)
                .sign(Algorithm.HMAC256(insuranceUser.getUserPass()));
        return token;
    }

}
