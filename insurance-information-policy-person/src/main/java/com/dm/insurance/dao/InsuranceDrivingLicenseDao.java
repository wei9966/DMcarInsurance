package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceDrivingLicense;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 行驶证车主表(InsuranceDrivingLicense)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-26 13:35:59
 */
public interface InsuranceDrivingLicenseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param drivingLicenseId 主键
     * @return 实例对象
     */
    InsuranceDrivingLicense queryById(Integer drivingLicenseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceDrivingLicense> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceDrivingLicense 实例对象
     * @return 对象列表
     */
    List<InsuranceDrivingLicense> queryAll(InsuranceDrivingLicense insuranceDrivingLicense);

    /**
     * 新增数据
     *
     * @param insuranceDrivingLicense 实例对象
     * @return 影响行数
     */
    int insert(InsuranceDrivingLicense insuranceDrivingLicense);

    /**
     * 修改数据
     *
     * @param insuranceDrivingLicense 实例对象
     * @return 影响行数
     */
    int update(InsuranceDrivingLicense insuranceDrivingLicense);

    /**
     * 通过主键删除数据
     *
     * @param drivingLicenseId 主键
     * @return 影响行数
     */
    int deleteById(Integer drivingLicenseId);

}