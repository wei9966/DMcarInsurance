package com.dm.insurance.entity;

import java.io.Serializable;

/**
 * 车辆信息表(InsuranceCarInfo)实体类
 *
 * @author makejava
 * @since 2020-06-28 09:02:26
 */
public class InsuranceCarInfo implements Serializable {
    private static final long serialVersionUID = -68179530178444507L;
    /**
    * 车辆id
    */
    private Integer carInfoId;
    /**
    * 车辆品牌型号
    */
    private String carInfoBrand;
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
    * 车辆配置型号
    */
    private String carInfoConfigurationModel;
    /**
    * 初登日期
    */
    private Object carInfoDateFirst;
    /**
    * 是否过户车辆
    */
    private Integer carInfoTransfer;
    /**
    * 过户日期
    */
    private Object carInfoTransferDate;
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

    public Object getCarInfoDateFirst() {
        return carInfoDateFirst;
    }

    public void setCarInfoDateFirst(Object carInfoDateFirst) {
        this.carInfoDateFirst = carInfoDateFirst;
    }

    public Integer getCarInfoTransfer() {
        return carInfoTransfer;
    }

    public void setCarInfoTransfer(Integer carInfoTransfer) {
        this.carInfoTransfer = carInfoTransfer;
    }

    public Object getCarInfoTransferDate() {
        return carInfoTransferDate;
    }

    public void setCarInfoTransferDate(Object carInfoTransferDate) {
        this.carInfoTransferDate = carInfoTransferDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}