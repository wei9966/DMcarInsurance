package com.dm.insurance.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 保险信息表(InsuranceCarInsur)实体类
 *
 * @author makejava
 * @since 2020-06-24 16:35:41
 */
public class InsuranceCarInsur implements Serializable {
    private static final long serialVersionUID = -98858435964107878L;
    /**
    * 保险编号，主键，唯一
    */
    private Integer ciId;
    /**
    * 保险名称
    */
    private String ciName;
    /**
    * 保险类型
    */
    private String ciType;
    /**
    * 赔付费率
    */
    private Object compRate;
    /**
    * 最大保额
    */
    private Double maxmoney;
    /**
    * 保费费率（如果该保险的费用和一些价格有关系的一种比率）
    */
    private Object insRale;
    /**
    * 保险状态（0待审核，1上架，2下架）
    */
    private Integer ciState;
    /**
    * 审核人编号
    */
    private Integer unId;
    /**
    * 添加时间
    */
    private Date ciAddtime;
    /**
    * 保险基础价
    */
    private Double ciMoney;


    public Integer getCiId() {
        return ciId;
    }

    public void setCiId(Integer ciId) {
        this.ciId = ciId;
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    public String getCiType() {
        return ciType;
    }

    public void setCiType(String ciType) {
        this.ciType = ciType;
    }

    public Object getCompRate() {
        return compRate;
    }

    public void setCompRate(Object compRate) {
        this.compRate = compRate;
    }

    public Double getMaxmoney() {
        return maxmoney;
    }

    public void setMaxmoney(Double maxmoney) {
        this.maxmoney = maxmoney;
    }

    public Object getInsRale() {
        return insRale;
    }

    public void setInsRale(Object insRale) {
        this.insRale = insRale;
    }

    public Integer getCiState() {
        return ciState;
    }

    public void setCiState(Integer ciState) {
        this.ciState = ciState;
    }

    public Integer getUnId() {
        return unId;
    }

    public void setUnId(Integer unId) {
        this.unId = unId;
    }

    public Date getCiAddtime() {
        return ciAddtime;
    }

    public void setCiAddtime(Date ciAddtime) {
        this.ciAddtime = ciAddtime;
    }

    public Double getCiMoney() {
        return ciMoney;
    }

    public void setCiMoney(Double ciMoney) {
        this.ciMoney = ciMoney;
    }

}