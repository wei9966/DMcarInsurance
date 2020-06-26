package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (InsuranceClause)实体类
 *
 * @author makejava
 * @since 2020-06-26 13:36:54
 */
@Data
public class InsuranceClause implements Serializable {
    private static final long serialVersionUID = 417105149222617200L;
    /**
    * 条款id
    */
    private Integer clauseId;
    /**
    * 条款类型
    */
    private String clauseType;
    /**
    * 条款内容
    */
    private String clauseContent;


    public Integer getClauseId() {
        return clauseId;
    }

    public void setClauseId(Integer clauseId) {
        this.clauseId = clauseId;
    }

    public String getClauseType() {
        return clauseType;
    }

    public void setClauseType(String clauseType) {
        this.clauseType = clauseType;
    }

    public String getClauseContent() {
        return clauseContent;
    }

    public void setClauseContent(String clauseContent) {
        this.clauseContent = clauseContent;
    }

}