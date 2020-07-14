package com.dm.insurance.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

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
    private Object icMoney;
    /**
     * 最大保额
     */
    private Object maxMoney;
    /**
     * 详细信息表(存储的是用户报案信息表的文件名：以车牌号命名）
     */
    private String msgTable;

    private InsuranceUser insuranceUser;

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarInfoId() {
        return carInfoId;
    }

    public void setCarInfoId(Integer carInfoId) {
        this.carInfoId = carInfoId;
    }

    public Integer getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(Integer insuredId) {
        this.insuredId = insuredId;
    }

    public Integer getDrivingLicenseId() {
        return drivingLicenseId;
    }

    public void setDrivingLicenseId(Integer drivingLicenseId) {
        this.drivingLicenseId = drivingLicenseId;
    }

    public Date getIcAddtime() {
        return icAddtime;
    }

    public void setIcAddtime(Date icAddtime) {
        this.icAddtime = icAddtime;
    }

    public Date getIcTotime() {
        return icTotime;
    }

    public void setIcTotime(Date icTotime) {
        this.icTotime = icTotime;
    }

    public Integer getIpId() {
        return ipId;
    }

    public void setIpId(Integer ipId) {
        this.ipId = ipId;
    }

    public String getCiId() {
        return ciId;
    }

    public void setCiId(String ciId) {
        this.ciId = ciId;
    }

    public Integer getUnId() {
        return unId;
    }

    public void setUnId(Integer unId) {
        this.unId = unId;
    }

    public Integer getIcState() {
        return icState;
    }

    public void setIcState(Integer icState) {
        this.icState = icState;
    }

    public Integer getUnShenid() {
        return unShenid;
    }

    public void setUnShenid(Integer unShenid) {
        this.unShenid = unShenid;
    }

    public Integer getIcIspayment() {
        return icIspayment;
    }

    public void setIcIspayment(Integer icIspayment) {
        this.icIspayment = icIspayment;
    }

    public Object getIcMoney() {
        return icMoney;
    }

    public void setIcMoney(Object icMoney) {
        this.icMoney = icMoney;
    }

    public Object getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Object maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getMsgTable() {
        return msgTable;
    }

    public void setMsgTable(String msgTable) {
        this.msgTable = msgTable;
    }

}