package com.dm.insurance.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (InsuranceOtherInsuranceInformation)实体类
 *
 * @author makejava
 * @since 2020-06-24 16:13:08
 */
public class InsuranceOtherInsuranceInformation implements Serializable {
    private static final long serialVersionUID = 344742950978130057L;
    /**
    * 其他投保信息id
    */
    private Integer otherInsuranceInformationId;
    /**
    * 其他投保信息起保日期
    */
    private Date otherInsuranceInformationDateBegin;
    /**
    * 其他投保信息结束日期
    */
    private Date otherInsuranceInformationDateFinish;
    /**
    * 其他投保信息姓名
    */
    private String otherInsuranceInformationName;
    /**
    * 其他投保信息身份证
    */
    private String otherInsuranceInformationCard;
    /**
    * 其他投保信息邮箱
    */
    private String otherInsuranceInformationEmail;


    public Integer getOtherInsuranceInformationId() {
        return otherInsuranceInformationId;
    }

    public void setOtherInsuranceInformationId(Integer otherInsuranceInformationId) {
        this.otherInsuranceInformationId = otherInsuranceInformationId;
    }

    public Date getOtherInsuranceInformationDateBegin() {
        return otherInsuranceInformationDateBegin;
    }

    public void setOtherInsuranceInformationDateBegin(Date otherInsuranceInformationDateBegin) {
        this.otherInsuranceInformationDateBegin = otherInsuranceInformationDateBegin;
    }

    public Date getOtherInsuranceInformationDateFinish() {
        return otherInsuranceInformationDateFinish;
    }

    public void setOtherInsuranceInformationDateFinish(Date otherInsuranceInformationDateFinish) {
        this.otherInsuranceInformationDateFinish = otherInsuranceInformationDateFinish;
    }

    public String getOtherInsuranceInformationName() {
        return otherInsuranceInformationName;
    }

    public void setOtherInsuranceInformationName(String otherInsuranceInformationName) {
        this.otherInsuranceInformationName = otherInsuranceInformationName;
    }

    public String getOtherInsuranceInformationCard() {
        return otherInsuranceInformationCard;
    }

    public void setOtherInsuranceInformationCard(String otherInsuranceInformationCard) {
        this.otherInsuranceInformationCard = otherInsuranceInformationCard;
    }

    public String getOtherInsuranceInformationEmail() {
        return otherInsuranceInformationEmail;
    }

    public void setOtherInsuranceInformationEmail(String otherInsuranceInformationEmail) {
        this.otherInsuranceInformationEmail = otherInsuranceInformationEmail;
    }

}