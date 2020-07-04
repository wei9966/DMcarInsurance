package com.dm.insurance.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 车辆信息表(InsuranceCarInfo)实体类
 *
 * @author makejava
 * @since 2020-06-30 11:45:30
 */
@Data
public class InsuranceCarInfo implements Serializable {
    private static final long serialVersionUID = -35270133038857327L;
    /**
    * 车辆id
    */
    private Integer carInfoId;
    /**
    * 车辆品牌型号
    */
    private String carInfoBrand;
    /**
    * 车辆注册日期
    */
    private Date carInfoRegisterDate;
    /**
    * 车辆投保城市
    */
    private Integer cityId;
    /**
    * 车辆车牌号
    */
    private String carInfoCard;
    /**
    * 车辆车架号
    */
    private String carInfoFrameNo;
    /**
    * 车辆发动机号
    */
    private String carInfoEnigneNumber;
    /**
    * 车辆类型
    */
    private String carInfoConfigurationModel;
    /**
    * 初登日期
    */
    private Date carInfoDateFirst;
    /**
    * 是否过户车辆
    */
    private Integer carInfoTransfer;
    /**
    * 过户日期
    */
    private Date carInfoTransferDate;
    /**
    * 用户id
    */
    private Integer userId;


    public Integer getCarInfoId() {
        return carInfoId;
    }

    public void setCarInfoId(Integer carInfoId) {
        this.carInfoId = carInfoId;
    }

    public String getCarInfoBrand() {
        return carInfoBrand;
    }

    public void setCarInfoBrand(String carInfoBrand) {
        this.carInfoBrand = carInfoBrand;
    }

    public Date getCarInfoRegisterDate() {
        return carInfoRegisterDate;
    }

    public void setCarInfoRegisterDate(Date carInfoRegisterDate) {
        this.carInfoRegisterDate = carInfoRegisterDate;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCarInfoCard() {
        return carInfoCard;
    }

    public void setCarInfoCard(String carInfoCard) {
        this.carInfoCard = carInfoCard;
    }

    public String getCarInfoFrameNo() {
        return carInfoFrameNo;
    }

    public void setCarInfoFrameNo(String carInfoFrameNo) {
        this.carInfoFrameNo = carInfoFrameNo;
    }

    public String getCarInfoEnigneNumber() {
        return carInfoEnigneNumber;
    }

    public void setCarInfoEnigneNumber(String carInfoEnigneNumber) {
        this.carInfoEnigneNumber = carInfoEnigneNumber;
    }

    public String getCarInfoConfigurationModel() {
        return carInfoConfigurationModel;
    }

    public void setCarInfoConfigurationModel(String carInfoConfigurationModel) {
        this.carInfoConfigurationModel = carInfoConfigurationModel;
    }

    public Date getCarInfoDateFirst() {
        return carInfoDateFirst;
    }

    public void setCarInfoDateFirst(Date carInfoDateFirst) {
        this.carInfoDateFirst = carInfoDateFirst;
    }

    public Integer getCarInfoTransfer() {
        return carInfoTransfer;
    }

    public void setCarInfoTransfer(Integer carInfoTransfer) {
        this.carInfoTransfer = carInfoTransfer;
    }

    public Date getCarInfoTransferDate() {
        return carInfoTransferDate;
    }

    public void setCarInfoTransferDate(Date carInfoTransferDate) {
        this.carInfoTransferDate = carInfoTransferDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}