package com.dm.insurance.service;

import com.dm.insurance.entity.InsurancePersonnelInformation;
import java.util.List;

/**
 * (InsurancePersonnelInformation)表服务接口
 *
 * @author wb
 * @since 2020-07-13 09:14:04
 */
public interface InsurancePersonnelInformationService {

    /**
     * 通过ID查询单条数据
     *
     * @param personnelId 主键
     * @return 实例对象
     */
    InsurancePersonnelInformation queryById(Integer personnelId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsurancePersonnelInformation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insurancePersonnelInformation 实例对象
     * @return 实例对象
     */
    InsurancePersonnelInformation insert(InsurancePersonnelInformation insurancePersonnelInformation);

    /**
     * 修改数据
     *
     * @param insurancePersonnelInformation 实例对象
     * @return 实例对象
     */
    InsurancePersonnelInformation update(InsurancePersonnelInformation insurancePersonnelInformation);

    /**
     * 通过主键删除数据
     *
     * @param personnelId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer personnelId);

}