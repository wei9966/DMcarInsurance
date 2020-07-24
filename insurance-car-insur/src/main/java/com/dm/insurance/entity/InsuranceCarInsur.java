package com.dm.insurance.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 保险信息表(InsuranceCarInsur)实体类
 *
 * @author makejava
 * @since 2020-06-24 16:35:41
 */
@Data
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
    private Double compRate;
    /**
     * 最大保额
     */
    private Double maxmoney;
    /**
     * 保费费率（如果该保险的费用和一些价格有关系的一种比率）
     */
    private Double insRale;
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


}