package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 车辆信息表(InsuranceCarInfo)实体类
 *
 * @author makejava
 * @since 2020-06-29 12:51:43
 */
@Data
public class InsuranceCarInfo implements Serializable {
    private static final long serialVersionUID = -47147877703713710L;
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


}