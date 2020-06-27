package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 配送表(InsuranceDistribution)实体类
 *
 * @author makejava
 * @since 2020-06-26 13:36:38
 */
@Data
public class InsuranceDistribution implements Serializable {
    private static final long serialVersionUID = 822446469143485178L;
    /**
    * 配送id
    */
    private Integer distributionId;
    /**
    * 配送方式
    */
    private String distributionType;


    public Integer getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Integer distributionId) {
        this.distributionId = distributionId;
    }

    public String getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(String distributionType) {
        this.distributionType = distributionType;
    }

}