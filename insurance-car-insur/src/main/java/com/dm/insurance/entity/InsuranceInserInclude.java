package com.dm.insurance.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 套餐清单(InsuranceInserInclude)实体类
 *
 * @author makejava
 * @since 2020-06-27 11:09:43
 */
@Data
public class InsuranceInserInclude implements Serializable {
    private static final long serialVersionUID = -64052047205359527L;
    /**
     * 套餐编号，主键，唯一
     */
    private Integer iiId;
    /**
     * 保险编号一（0无，保险id）
     */
    private Integer ci1;
    /**
     * 保险编号二（0无，1有）
     */
    private Integer ci2;
    /**
     * 保险编号三（0无，1有）
     */
    private Integer ci3;
    /**
     * 保险编号四（0无，1有）
     */
    private Integer ci4;
    /**
     * 保险编号五（0无，1有）
     */
    private Integer ci5;
    /**
     * 保险编号六（0无，1有）
     */
    private Integer ci6;
    /**
     * 保险编号七（0无，1有）
     */
    private Integer ci7;
    /**
     * 保险编号八（0无，1有）
     */
    private Integer ci8;
    /**
     * 保险编号九（0无，1有）
     */
    private Integer ci9;
    /**
     * 保险编号十（0无，1有）
     */
    private Integer ci10;
    /**
     * 保险编号十一（0无，1有）
     */
    private Integer ci11;

    private Integer ci12;

    private Integer ci13;

    private Integer ci14;

    private Integer ci15;

    private Integer ci16;

    private Integer ci17;

    private Integer ci19;

    private Integer ci20;


    public Integer getIiId() {
        return iiId;
    }

    public void setIiId(Integer iiId) {
        this.iiId = iiId;
    }

    public Integer getCi1() {
        return ci1;
    }

    public void setCi1(Integer ci1) {
        this.ci1 = ci1;
    }

    public Integer getCi2() {
        return ci2;
    }

    public void setCi2(Integer ci2) {
        this.ci2 = ci2;
    }

    public Integer getCi3() {
        return ci3;
    }

    public void setCi3(Integer ci3) {
        this.ci3 = ci3;
    }

    public Integer getCi4() {
        return ci4;
    }

    public void setCi4(Integer ci4) {
        this.ci4 = ci4;
    }

    public Integer getCi5() {
        return ci5;
    }

    public void setCi5(Integer ci5) {
        this.ci5 = ci5;
    }

    public Integer getCi6() {
        return ci6;
    }

    public void setCi6(Integer ci6) {
        this.ci6 = ci6;
    }

    public Integer getCi7() {
        return ci7;
    }

    public void setCi7(Integer ci7) {
        this.ci7 = ci7;
    }

    public Integer getCi8() {
        return ci8;
    }

    public void setCi8(Integer ci8) {
        this.ci8 = ci8;
    }

    public Integer getCi9() {
        return ci9;
    }

    public void setCi9(Integer ci9) {
        this.ci9 = ci9;
    }

    public Integer getCi10() {
        return ci10;
    }

    public void setCi10(Integer ci10) {
        this.ci10 = ci10;
    }

    public Integer getCi11() {
        return ci11;
    }

    public void setCi11(Integer ci11) {
        this.ci11 = ci11;
    }

    public Integer getCi12() {
        return ci12;
    }

    public void setCi12(Integer ci12) {
        this.ci12 = ci12;
    }

    public Integer getCi13() {
        return ci13;
    }

    public void setCi13(Integer ci13) {
        this.ci13 = ci13;
    }

    public Integer getCi14() {
        return ci14;
    }

    public void setCi14(Integer ci14) {
        this.ci14 = ci14;
    }

    public Integer getCi15() {
        return ci15;
    }

    public void setCi15(Integer ci15) {
        this.ci15 = ci15;
    }

    public Integer getCi16() {
        return ci16;
    }

    public void setCi16(Integer ci16) {
        this.ci16 = ci16;
    }

    public Integer getCi17() {
        return ci17;
    }

    public void setCi17(Integer ci17) {
        this.ci17 = ci17;
    }

    public Integer getCi19() {
        return ci19;
    }

    public void setCi19(Integer ci19) {
        this.ci19 = ci19;
    }

    public Integer getCi20() {
        return ci20;
    }

    public void setCi20(Integer ci20) {
        this.ci20 = ci20;
    }

}