package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表(InsuranceUser)实体类
 *
 * @author makejava
 * @since 2020-06-27 14:34:31
 */
@Data
public class InsuranceUser implements Serializable {
    private static final long serialVersionUID = 106662147765048103L;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 密码
     */
    private String userPass;
    /**
     * 手机
     */
    private String userPhone;
    /**
     * 邮箱
     */
    private String userEmail;
    /**
     * 性别
     */
    private String userSex;
    /**
     * 住址
     */
    private String userAddress;
    /**
     * 身份证号
     */
    private String userCard;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

}