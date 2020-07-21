package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceInserInclude;

import java.util.List;

/**
 * 套餐清单(InsuranceInserInclude)表服务接口
 *
 * @author makejava
 * @since 2020-06-27 11:09:43
 */
public interface InsuranceInserIncludeService {

    /**
     * 通过ID查询单条数据
     *
     * @param iiId 主键
     * @return 实例对象
     */
    InsuranceInserInclude queryById(Integer iiId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceInserInclude> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceInserInclude 实例对象
     * @return 实例对象
     */
    InsuranceInserInclude insert(InsuranceInserInclude insuranceInserInclude);

    /**
     * 修改数据
     *
     * @param insuranceInserInclude 实例对象
     * @return 实例对象
     */
    InsuranceInserInclude update(InsuranceInserInclude insuranceInserInclude);

    /**
     * 通过主键删除数据
     *
     * @param iiId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer iiId);

}