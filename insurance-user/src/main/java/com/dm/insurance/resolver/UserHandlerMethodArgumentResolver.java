package com.dm.insurance.resolver;

import com.dm.insurance.annotation.CurrentOperator;
import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.interceptor.TokenInterceptor;
import com.dm.insurance.service.InsuranceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Create By WeiBin on 2020/7/20 14:53
 */
@Component
public class UserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Autowired
    private InsuranceUserService insuranceUserService;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().isAssignableFrom(InsuranceUser.class)
                && methodParameter.hasParameterAnnotation(CurrentOperator.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        //获取用户id
        Object attribute = webRequest.getAttribute(TokenInterceptor.USER_KEY, RequestAttributes.SCOPE_REQUEST);
        System.out.println("获取的用户id" + attribute);
        if (attribute == null) {
            return null;
        }
        //获取用户信息
        InsuranceUser insuranceUser = insuranceUserService.queryById(Integer.parseInt(attribute.toString()));
        return insuranceUser;
    }
}
