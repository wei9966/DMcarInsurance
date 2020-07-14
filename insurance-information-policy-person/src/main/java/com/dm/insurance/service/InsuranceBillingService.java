package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceBilling;

import java.util.List;

/**
 * 开票表(InsuranceBilling)表服务接口
 *
 * @author makejava
 * @since 2020-06-26 13:36:20
 */
public interface InsuranceBillingService {

    /**
     * 通过ID查询单条数据
     *
     * @param billingId 主键
     * @return 实例对象
     */
    InsuranceBilling queryById(Integer billingId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceBilling> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceBilling 实例对象
     * @return 实例对象
     */
    InsuranceBilling insert(InsuranceBilling insuranceBilling);

    /**
     * 修改数据
     *
     * @param insuranceBilling 实例对象
     * @return 实例对象
     */
    InsuranceBilling update(InsuranceBilling insuranceBilling);

    /**
     * 通过主键删除数据
     *
     * @param billingId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer billingId);

}