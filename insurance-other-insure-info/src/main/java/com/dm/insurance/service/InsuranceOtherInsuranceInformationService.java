package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceOtherInsuranceInformation;
import java.util.List;

/**
 * (InsuranceOtherInsuranceInformation)表服务接口
 *
 * @author makejava
 * @since 2020-06-24 16:13:12
 */
public interface InsuranceOtherInsuranceInformationService {

    /**
     * 通过ID查询单条数据
     *
     * @param otherInsuranceInformationId 主键
     * @return 实例对象
     */
    InsuranceOtherInsuranceInformation queryById(Integer otherInsuranceInformationId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceOtherInsuranceInformation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceOtherInsuranceInformation 实例对象
     * @return 实例对象
     */
    InsuranceOtherInsuranceInformation insert(InsuranceOtherInsuranceInformation insuranceOtherInsuranceInformation);

    /**
     * 修改数据
     *
     * @param insuranceOtherInsuranceInformation 实例对象
     * @return 实例对象
     */
    InsuranceOtherInsuranceInformation update(InsuranceOtherInsuranceInformation insuranceOtherInsuranceInformation);

    /**
     * 通过主键删除数据
     *
     * @param otherInsuranceInformationId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer otherInsuranceInformationId);

}