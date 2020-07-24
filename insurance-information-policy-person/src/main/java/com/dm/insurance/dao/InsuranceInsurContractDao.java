package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceInsurContract;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 保单表(InsuranceInsurContract)表数据库访问层
 *
 * @author wb
 * @since 2020-07-21 14:21:33
 */
public interface InsuranceInsurContractDao {

    /**
     * 通过ID查询单条数据
     *
     * @param policyId 主键
     * @return 实例对象
     */
    InsuranceInsurContract queryById(Integer policyId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceInsurContract> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceInsurContract 实例对象
     * @return 对象列表
     */
    List<InsuranceInsurContract> queryAll(InsuranceInsurContract insuranceInsurContract);

    /**
     * 新增数据
     *
     * @param insuranceInsurContract 实例对象
     * @return 影响行数
     */
    int insert(InsuranceInsurContract insuranceInsurContract);

    /**
     * 修改数据
     *
     * @param insuranceInsurContract 实例对象
     * @return 影响行数
     */
    int update(InsuranceInsurContract insuranceInsurContract);

    /**
     * 通过主键删除数据
     *
     * @param policyId 主键
     * @return 影响行数
     */
    int deleteById(Integer policyId);

}