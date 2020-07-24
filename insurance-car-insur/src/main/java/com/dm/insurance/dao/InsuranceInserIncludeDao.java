package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceInserInclude;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 套餐清单(InsuranceInserInclude)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-27 11:09:43
 */
@Mapper
public interface InsuranceInserIncludeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param iiId 主键
     * @return 实例对象
     */
    InsuranceInserInclude queryById(Integer iiId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceInserInclude> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceInserInclude 实例对象
     * @return 对象列表
     */
    List<InsuranceInserInclude> queryAll(InsuranceInserInclude insuranceInserInclude);

    /**
     * 新增数据
     *
     * @param insuranceInserInclude 实例对象
     * @return 影响行数
     */
    int insert(InsuranceInserInclude insuranceInserInclude);

    /**
     * 修改数据
     *
     * @param insuranceInserInclude 实例对象
     * @return 影响行数
     */
    int update(InsuranceInserInclude insuranceInserInclude);

    /**
     * 通过主键删除数据
     *
     * @param iiId 主键
     * @return 影响行数
     */
    int deleteById(Integer iiId);

}