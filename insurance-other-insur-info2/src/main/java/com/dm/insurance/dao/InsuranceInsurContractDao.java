package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.entity.InsuranceUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 保单表(InsuranceInsurContract)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-27 14:19:37
 */
@Mapper
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
      /*
      * 通过用户id 关联表单id  查询是否买买保险
      *
      * */
     List<InsuranceUser> selectByinfo(Integer userId);

}