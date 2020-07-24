package com.dm.insurance.config;

import com.dm.insurance.interceptor.TokenInterceptor;
import com.dm.insurance.resolver.UserHandlerMethodArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebMvcConfiguer implements WebMvcConfigurer {

    @Autowired
    private UserHandlerMethodArgumentResolver methodArgumentResolver;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getTokenInterceptor())
                .addPathPatterns("/user/insuranceUser/**");
    }
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(methodArgumentResolver);
    }
    @Bean
    public HandlerInterceptor getTokenInterceptor(){
        return new TokenInterceptor();
    }

}

