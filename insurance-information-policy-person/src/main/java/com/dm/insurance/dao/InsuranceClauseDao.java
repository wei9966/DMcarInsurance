package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceClause;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (InsuranceClause)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-26 13:36:54
 */
public interface InsuranceClauseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param clauseId 主键
     * @return 实例对象
     */
    InsuranceClause queryById(Integer clauseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceClause> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceClause 实例对象
     * @return 对象列表
     */
    List<InsuranceClause> queryAll(InsuranceClause insuranceClause);

    /**
     * 新增数据
     *
     * @param insuranceClause 实例对象
     * @return 影响行数
     */
    int insert(InsuranceClause insuranceClause);

    /**
     * 修改数据
     *
     * @param insuranceClause 实例对象
     * @return 影响行数
     */
    int update(InsuranceClause insuranceClause);

    /**
     * 通过主键删除数据
     *
     * @param clauseId 主键
     * @return 影响行数
     */
    int deleteById(Integer clauseId);

}