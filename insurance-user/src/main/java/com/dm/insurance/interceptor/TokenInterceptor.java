package com.dm.insurance.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.service.InsuranceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    InsuranceUserService insuranceUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从请求头中获取token
        String token = request.getHeader("token");
    System.out.println("token："+request.getHeader("token"));
        System.out.println("token2："+token);

        //执行认证
        if(token == null){
            throw new RuntimeException("尚未登陆!");
        }
        //获取token中的userId
        String userId;
        try {
            userId = JWT.decode(token).getAudience().get(0);
        } catch (JWTDecodeException j) {
            throw new JWTDecodeException("token异常!请重新登陆");
        }
        InsuranceUser insuranceUser =insuranceUserService.queryById(Integer.valueOf(userId));
//        User user = userService.findUserById(Long.valueOf(userId));
        if (insuranceUser == null) {
            throw new RuntimeException("未找到该用户!");
        }
        // 验证 token
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(insuranceUser.getUserPass())).build();
        try {
            jwtVerifier.verify(token);
        } catch (JWTVerificationException e) {
            throw new RuntimeException("token异常!请重新登陆");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
