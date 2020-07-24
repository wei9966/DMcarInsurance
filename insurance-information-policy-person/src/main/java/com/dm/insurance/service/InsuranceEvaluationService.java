package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceEvaluation;

import java.util.List;

/**
 * (InsuranceEvaluation)表服务接口
 *
 * @author wb
 * @since 2020-07-12 14:38:10
 */
public interface InsuranceEvaluationService {

    /**
     * 通过ID查询单条数据
     *
     * @param evaluationId 主键
     * @return 实例对象
     */
    InsuranceEvaluation queryById(Integer evaluationId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceEvaluation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceEvaluation 实例对象
     * @return 实例对象
     */
    InsuranceEvaluation insert(InsuranceEvaluation insuranceEvaluation);

    /**
     * 修改数据
     *
     * @param insuranceEvaluation 实例对象
     * @return 实例对象
     */
    InsuranceEvaluation update(InsuranceEvaluation insuranceEvaluation);

    /**
     * 通过主键删除数据
     *
     * @param evaluationId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer evaluationId);

}