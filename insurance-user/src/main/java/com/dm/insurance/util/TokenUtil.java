package com.dm.insurance.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.dm.insurance.entity.InsuranceLogin;
import com.dm.insurance.entity.InsuranceUser;

import java.util.Date;

public class TokenUtil {


  // 1 秒=1000 毫秒
  private static final long second = 1000;
  // 1 分=60000 毫秒
  private static final long minute = 60000;
  // 1 时=3600000 毫秒
  private static final long hour = 3600000;
  // 1 天=86400000 毫秒
  private static final long day = 86400000;
  // 1 周=604800000 毫秒
  private static final long week = 604800000;
  // 1 年=31536000000 毫秒
  private static final long year = 31536000000L;
  // 设置过期时间为
  private static final Long EXPIRE_TIME = Long.valueOf(60*minute);

  public static String getToken(InsuranceLogin insuranceLogin) {
    String token = "";
    Date date = new Date();
    date.setTime(System.currentTimeMillis() + EXPIRE_TIME);
    token =
        JWT.create()
            .withAudience(String.valueOf(insuranceLogin.getInsuranceLoginId()))
            .withExpiresAt(date)
            .sign(Algorithm.HMAC256(insuranceLogin.getInsuranceLoginPassword()));
    return token;
  }
}
