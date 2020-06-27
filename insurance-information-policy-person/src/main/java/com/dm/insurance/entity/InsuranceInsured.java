package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 被保险人表(InsuranceInsured)实体类
 *
 * @author makejava
 * @since 2020-06-26 13:35:33
 */
@Data
public class InsuranceInsured implements Serializable {
    private static final long serialVersionUID = -73039296092803476L;
    /**
    * 被保险人id
    */
    private Integer insuredId;
    /**
    * 被保险人名称
    */
    private String insuredName;
    /**
    * 被保险人身份证
    */
    private String insuredCard;
    /**
    * 被保险人地址
    */
    private String insuredAddress;
    /**
    * 被保险人邮箱
    */
    private String insuredEmail;


    public Integer getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(Integer insuredId) {
        this.insuredId = insuredId;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getInsuredCard() {
        return insuredCard;
    }

    public void setInsuredCard(String insuredCard) {
        this.insuredCard = insuredCard;
    }

    public String getInsuredAddress() {
        return insuredAddress;
    }

    public void setInsuredAddress(String insuredAddress) {
        this.insuredAddress = insuredAddress;
    }

    public String getInsuredEmail() {
        return insuredEmail;
    }

    public void setInsuredEmail(String insuredEmail) {
        this.insuredEmail = insuredEmail;
    }

}