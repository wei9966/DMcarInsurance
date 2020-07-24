package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (InsuranceLogin)实体类
 *
 * @author wb
 * @since 2020-07-24 19:38:25
 */
@Data
public class InsuranceLogin implements Serializable {
    private static final long serialVersionUID = 571213781490933569L;
    /**
    * 登录id
    */
    private Integer insuranceLoginId;
    /**
    * 登录用户名
    */
    private String insuranceLoginUser;
    /**
    * 登录密码
    */
    private String insuranceLoginPassword;
    /**
    * 角色id
    */
    private Integer roleId;
    /**
    * 登录手机号
    */
    private String insuranceLoginPhone;
    /**
    * 登录邮箱
    */
    private String insuranceLoginEmai;


    public Integer getInsuranceLoginId() {
        return insuranceLoginId;
    }

    public void setInsuranceLoginId(Integer insuranceLoginId) {
        this.insuranceLoginId = insuranceLoginId;
    }

    public String getInsuranceLoginUser() {
        return insuranceLoginUser;
    }

    public void setInsuranceLoginUser(String insuranceLoginUser) {
        this.insuranceLoginUser = insuranceLoginUser;
    }

    public String getInsuranceLoginPassword() {
        return insuranceLoginPassword;
    }

    public void setInsuranceLoginPassword(String insuranceLoginPassword) {
        this.insuranceLoginPassword = insuranceLoginPassword;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getInsuranceLoginPhone() {
        return insuranceLoginPhone;
    }

    public void setInsuranceLoginPhone(String insuranceLoginPhone) {
        this.insuranceLoginPhone = insuranceLoginPhone;
    }

    public String getInsuranceLoginEmai() {
        return insuranceLoginEmai;
    }

    public void setInsuranceLoginEmai(String insuranceLoginEmai) {
        this.insuranceLoginEmai = insuranceLoginEmai;
    }

}