package com.dm.insurance.entity;

import java.io.Serializable;

/**
 * 开票表(InsuranceBilling)实体类
 *
 * @author makejava
 * @since 2020-06-26 13:36:20
 */
public class InsuranceBilling implements Serializable {
    private static final long serialVersionUID = -57199548218189898L;
    /**
    * 开票id
    */
    private Integer billingId;
    /**
    * 客户类型
    */
    private String billingCustomerType;
    /**
    * 纳税人类型
    */
    private String billingTaxpayerType;
    /**
    * 发票类型
    */
    private String billingInvoiceType;


    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public String getBillingCustomerType() {
        return billingCustomerType;
    }

    public void setBillingCustomerType(String billingCustomerType) {
        this.billingCustomerType = billingCustomerType;
    }

    public String getBillingTaxpayerType() {
        return billingTaxpayerType;
    }

    public void setBillingTaxpayerType(String billingTaxpayerType) {
        this.billingTaxpayerType = billingTaxpayerType;
    }

    public String getBillingInvoiceType() {
        return billingInvoiceType;
    }

    public void setBillingInvoiceType(String billingInvoiceType) {
        this.billingInvoiceType = billingInvoiceType;
    }

}