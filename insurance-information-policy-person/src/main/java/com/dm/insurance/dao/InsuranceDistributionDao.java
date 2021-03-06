package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceDistribution;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 配送表(InsuranceDistribution)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-26 13:36:38
 */
public interface InsuranceDistributionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param distributionId 主键
     * @return 实例对象
     */
    InsuranceDistribution queryById(Integer distributionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceDistribution> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceDistribution 实例对象
     * @return 对象列表
     */
    List<InsuranceDistribution> queryAll(InsuranceDistribution insuranceDistribution);

    /**
     * 新增数据
     *
     * @param insuranceDistribution 实例对象
     * @return 影响行数
     */
    int insert(InsuranceDistribution insuranceDistribution);

    /**
     * 修改数据
     *
     * @param insuranceDistribution 实例对象
     * @return 影响行数
     */
    int update(InsuranceDistribution insuranceDistribution);

    /**
     * 通过主键删除数据
     *
     * @param distributionId 主键
     * @return 影响行数
     */
    int deleteById(Integer distributionId);

}