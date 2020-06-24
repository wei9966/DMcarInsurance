package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceOtherInsuranceInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (InsuranceOtherInsuranceInformation)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-24 16:13:11
 */
@Mapper
public interface InsuranceOtherInsuranceInformationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param otherInsuranceInformationId 主键
     * @return 实例对象
     */
    InsuranceOtherInsuranceInformation queryById(Integer otherInsuranceInformationId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceOtherInsuranceInformation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceOtherInsuranceInformation 实例对象
     * @return 对象列表
     */
    List<InsuranceOtherInsuranceInformation> queryAll(InsuranceOtherInsuranceInformation insuranceOtherInsuranceInformation);

    /**
     * 新增数据
     *
     * @param insuranceOtherInsuranceInformation 实例对象
     * @return 影响行数
     */
    int insert(InsuranceOtherInsuranceInformation insuranceOtherInsuranceInformation);

    /**
     * 修改数据
     *
     * @param insuranceOtherInsuranceInformation 实例对象
     * @return 影响行数
     */
    int update(InsuranceOtherInsuranceInformation insuranceOtherInsuranceInformation);

    /**
     * 通过主键删除数据
     *
     * @param otherInsuranceInformationId 主键
     * @return 影响行数
     */
    int deleteById(Integer otherInsuranceInformationId);

}