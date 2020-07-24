package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceEvaluation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (InsuranceEvaluation)表数据库访问层
 *
 * @author wb
 * @since 2020-07-12 14:38:10
 */
public interface InsuranceEvaluationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param evaluationId 主键
     * @return 实例对象
     */
    InsuranceEvaluation queryById(Integer evaluationId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceEvaluation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceEvaluation 实例对象
     * @return 对象列表
     */
    List<InsuranceEvaluation> queryAll(InsuranceEvaluation insuranceEvaluation);

    /**
     * 新增数据
     *
     * @param insuranceEvaluation 实例对象
     * @return 影响行数
     */
    int insert(InsuranceEvaluation insuranceEvaluation);

    /**
     * 修改数据
     *
     * @param insuranceEvaluation 实例对象
     * @return 影响行数
     */
    int update(InsuranceEvaluation insuranceEvaluation);

    /**
     * 通过主键删除数据
     *
     * @param evaluationId 主键
     * @return 影响行数
     */
    int deleteById(Integer evaluationId);

}