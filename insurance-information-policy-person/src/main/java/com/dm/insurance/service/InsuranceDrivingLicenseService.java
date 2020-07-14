package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceDrivingLicense;

import java.util.List;

/**
 * 行驶证车主表(InsuranceDrivingLicense)表服务接口
 *
 * @author makejava
 * @since 2020-06-26 13:35:59
 */
public interface InsuranceDrivingLicenseService {

    /**
     * 通过ID查询单条数据
     *
     * @param drivingLicenseId 主键
     * @return 实例对象
     */
    InsuranceDrivingLicense queryById(Integer drivingLicenseId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceDrivingLicense> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceDrivingLicense 实例对象
     * @return 实例对象
     */
    InsuranceDrivingLicense insert(InsuranceDrivingLicense insuranceDrivingLicense);

    /**
     * 修改数据
     *
     * @param insuranceDrivingLicense 实例对象
     * @return 实例对象
     */
    InsuranceDrivingLicense update(InsuranceDrivingLicense insuranceDrivingLicense);

    /**
     * 通过主键删除数据
     *
     * @param drivingLicenseId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer drivingLicenseId);

}