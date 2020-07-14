package com.dm.insurance.entity;

import java.io.Serializable;

/**
 * (InsuranceEvaluation)实体类
 *
 * @author wb
 * @since 2020-07-12 14:38:09
 */
public class InsuranceEvaluation implements Serializable {
    private static final long serialVersionUID = -49510376966245975L;
    /**
    * 估价id
    */
    private Integer evaluationId;
    /**
    * 估价类型
    */
    private String evaluationType;


    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public String getEvaluationType() {
        return evaluationType;
    }

    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

}