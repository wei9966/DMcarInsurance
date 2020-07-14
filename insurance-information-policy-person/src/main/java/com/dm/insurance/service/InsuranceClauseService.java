package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceClause;

import java.util.List;

/**
 * (InsuranceClause)表服务接口
 *
 * @author makejava
 * @since 2020-06-26 13:36:54
 */
public interface InsuranceClauseService {

    /**
     * 通过ID查询单条数据
     *
     * @param clauseId 主键
     * @return 实例对象
     */
    InsuranceClause queryById(Integer clauseId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceClause> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceClause 实例对象
     * @return 实例对象
     */
    InsuranceClause insert(InsuranceClause insuranceClause);

    /**
     * 修改数据
     *
     * @param insuranceClause 实例对象
     * @return 实例对象
     */
    InsuranceClause update(InsuranceClause insuranceClause);

    /**
     * 通过主键删除数据
     *
     * @param clauseId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer clauseId);

}