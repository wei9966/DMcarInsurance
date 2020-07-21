package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.entity.InsuranceUser;

import java.util.List;

/**
 * 保单表(InsuranceInsurContract)表服务接口
 *
 * @author makejava
 * @since 2020-06-27 14:19:37
 */
public interface InsuranceInsurContractService {

    /**
     * 通过ID查询单条数据
     *
     * @param policyId 主键
     * @return 实例对象
     */
    InsuranceInsurContract queryById(Integer policyId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<InsuranceInsurContract> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceInsurContract 实例对象
     * @return 实例对象
     */
    InsuranceInsurContract insert(InsuranceInsurContract insuranceInsurContract);

    /**
     * 修改数据
     *
     * @param insuranceInsurContract 实例对象
     * @return 实例对象
     */
    InsuranceInsurContract update(InsuranceInsurContract insuranceInsurContract);

    /**
     * 通过主键删除数据
     *
     * @param policyId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer policyId);

    /*
     * 通过用户id 关联表单id  查询是否买买保险
     * */
    List<InsuranceUser> selectByinfo(Integer userId);

}