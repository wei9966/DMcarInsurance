package com.dm.insurance.entity;

import java.io.Serializable;

/**
 * 统一地区库(InsuranceCity)实体类
 *
 * @author makejava
 * @since 2020-06-24 16:23:21
 */
public class InsuranceCity implements Serializable {
    private static final long serialVersionUID = -35990419390820870L;
    /**
    * 地址ID
    */
    private Integer baseAreaid;
    /**
    * 地区名字
    */
    private String name;
    /**
    * 上级路径ID
    */
    private Integer parentid;
    /**
    * 顺序
    */
    private Integer vieworder;


    public Integer getBaseAreaid() {
        return baseAreaid;
    }

    public void setBaseAreaid(Integer baseAreaid) {
        this.baseAreaid = baseAreaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getVieworder() {
        return vieworder;
    }

    public void setVieworder(Integer vieworder) {
        this.vieworder = vieworder;
    }

}