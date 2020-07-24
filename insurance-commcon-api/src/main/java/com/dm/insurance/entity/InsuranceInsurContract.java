package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 保单表(InsuranceInsurContract)实体类
 *
 * @author makejava
 * @since 2020-06-27 14:19:35
 */
@Data
public class InsuranceInsurContract implements Serializable {
    private static final long serialVersionUID = 816737472699898853L;
    /**
     * 保单id
     */
    private Integer policyId;
    /**
     * 保单对应的用户id
     */
    private Integer userId;
    /**
     * 保单对应的车辆信息id
     */
    private Integer carInfoId;
    /**
     * 被保险人id
     */
    private Integer insuredId;
    /**
     * 行驶车主id
     */
    private Integer drivingLicenseId;
    /**
     * 添加时间
     */
    private Date icAddtime;
    /**
     * 有效日期
     */
    private Date icTotime;
    /**
     * 套餐标识（0表示自选，套餐id表示对应套餐）
     */
    private Integer ipId;
    /**
     * 投保单号
     */
    private String ciId;
    /**
     * 添加人员
     */
    private Integer unId;
    /**
     * 订单状态你（0待审核，1生效，2不合格，3退保，4续保）
     */
    private Integer icState;
    /**
     * 审核人编号
     */
    private Integer unShenid;
    /**
     * 是否缴费（0否，1是）
     */
    private Integer icIspayment;
    /**
     * 应缴金额
     */
    private Double icMoney;
    /**
     * 最大保额
     */
    private Double maxMoney;
    /**
     * 详细信息表(存储的是用户报案信息表的文件名：以车牌号命名）
     */
    private String msgTable;

    private InsuranceUser insuranceUser;



}