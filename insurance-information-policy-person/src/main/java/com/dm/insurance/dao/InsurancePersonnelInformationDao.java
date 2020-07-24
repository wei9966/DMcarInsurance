package com.dm.insurance.dao;

import com.dm.insurance.entity.InsurancePersonnelInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (InsurancePersonnelInformation)表数据库访问层
 *
 * @author wb
 * @since 2020-07-13 09:14:04
 */
public interface InsurancePersonnelInformationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param personnelId 主键
     * @return 实例对象
     */
    InsurancePersonnelInformation queryById(Integer personnelId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsurancePersonnelInformation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insurancePersonnelInformation 实例对象
     * @return 对象列表
     */
    List<InsurancePersonnelInformation> queryAll(InsurancePersonnelInformation insurancePersonnelInformation);

    /**
     * 新增数据
     *
     * @param insurancePersonnelInformation 实例对象
     * @return 影响行数
     */
    int insert(InsurancePersonnelInformation insurancePersonnelInformation);

    /**
     * 修改数据
     *
     * @param insurancePersonnelInformation 实例对象
     * @return 影响行数
     */
    int update(InsurancePersonnelInformation insurancePersonnelInformation);

    /**
     * 通过主键删除数据
     *
     * @param personnelId 主键
     * @return 影响行数
     */
    int deleteById(Integer personnelId);

}