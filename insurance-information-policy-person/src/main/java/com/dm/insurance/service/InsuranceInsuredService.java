package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceInsured;

import java.util.List;

/**
 * 被保险人表(InsuranceInsured)表服务接口
 *
 * @author makejava
 * @since 2020-06-26 13:35:34
 */
public interface InsuranceInsuredService {

    /**
     * 通过ID查询单条数据
     *
     * @param insuredId 主键
     * @return 实例对象
     */
    InsuranceInsured queryById(Integer insuredId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceInsured> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceInsured 实例对象
     * @return 实例对象
     */
    InsuranceInsured insert(InsuranceInsured insuranceInsured);

    /**
     * 修改数据
     *
     * @param insuranceInsured 实例对象
     * @return 实例对象
     */
    InsuranceInsured update(InsuranceInsured insuranceInsured);

    /**
     * 通过主键删除数据
     *
     * @param insuredId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer insuredId);

}