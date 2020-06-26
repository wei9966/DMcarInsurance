package com.dm.insurance.entity;

import java.io.Serializable;

/**
 * 行驶证车主表(InsuranceDrivingLicense)实体类
 *
 * @author makejava
 * @since 2020-06-26 13:35:59
 */
public class InsuranceDrivingLicense implements Serializable {
    private static final long serialVersionUID = 496170648326228650L;
    /**
    * 行驶证id
    */
    private Integer drivingLicenseId;
    /**
    * 行驶证名称
    */
    private String drivingLicenseName;
    /**
    * 行驶证身份证
    */
    private String drivingLicenseCard;


    public Integer getDrivingLicenseId() {
        return drivingLicenseId;
    }

    public void setDrivingLicenseId(Integer drivingLicenseId) {
        this.drivingLicenseId = drivingLicenseId;
    }

    public String getDrivingLicenseName() {
        return drivingLicenseName;
    }

    public void setDrivingLicenseName(String drivingLicenseName) {
        this.drivingLicenseName = drivingLicenseName;
    }

    public String getDrivingLicenseCard() {
        return drivingLicenseCard;
    }

    public void setDrivingLicenseCard(String drivingLicenseCard) {
        this.drivingLicenseCard = drivingLicenseCard;
    }

}