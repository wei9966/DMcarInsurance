package com.dm.insurance.entity;

import java.io.Serializable;

/**
 * (InsurancePersonnelInformation)实体类
 *
 * @author wb
 * @since 2020-07-13 09:14:04
 */
public class InsurancePersonnelInformation implements Serializable {
    private static final long serialVersionUID = -60295150597620612L;
    /**
     * 预信息id
     */
    private Integer personnelId;
    /**
     * 估价
     */
    private Double personnelCarPrice;
    /**
     * 手机号
     */
    private String personnelPhone;
    /**
     * 套餐id
     */
    private Integer insuranceInserIncludeId;
    /**
     * 车牌号
     */
    private String personnelLicensePlate;
    /**
     * 城市id
     */
    private Integer insuranceCityId;
    /**
     * 新车是否上牌
     */
    private Integer personnelNewCarFlag;


    public Integer getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Integer personnelId) {
        this.personnelId = personnelId;
    }

    public Double getPersonnelCarPrice() {
        return personnelCarPrice;
    }

    public void setPersonnelCarPrice(Double personnelCarPrice) {
        this.personnelCarPrice = personnelCarPrice;
    }

    public String getPersonnelPhone() {
        return personnelPhone;
    }

    public void setPersonnelPhone(String personnelPhone) {
        this.personnelPhone = personnelPhone;
    }

    public Integer getInsuranceInserIncludeId() {
        return insuranceInserIncludeId;
    }

    public void setInsuranceInserIncludeId(Integer insuranceInserIncludeId) {
        this.insuranceInserIncludeId = insuranceInserIncludeId;
    }

    public String getPersonnelLicensePlate() {
        return personnelLicensePlate;
    }

    public void setPersonnelLicensePlate(String personnelLicensePlate) {
        this.personnelLicensePlate = personnelLicensePlate;
    }

    public Integer getInsuranceCityId() {
        return insuranceCityId;
    }

    public void setInsuranceCityId(Integer insuranceCityId) {
        this.insuranceCityId = insuranceCityId;
    }

    public Integer getPersonnelNewCarFlag() {
        return personnelNewCarFlag;
    }

    public void setPersonnelNewCarFlag(Integer personnelNewCarFlag) {
        this.personnelNewCarFlag = personnelNewCarFlag;
    }

}