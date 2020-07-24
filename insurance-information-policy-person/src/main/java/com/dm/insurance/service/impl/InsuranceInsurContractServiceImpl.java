package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.dao.InsuranceInsurContractDao;
import com.dm.insurance.service.InsuranceInsurContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 保单表(InsuranceInsurContract)表服务实现类
 *
 * @author wb
 * @since 2020-07-21 14:21:33
 */
@Service("insuranceInsurContractService")
public class InsuranceInsurContractServiceImpl implements InsuranceInsurContractService {
    @Resource
    private InsuranceInsurContractDao insuranceInsurContractDao;

    /**
     * 通过ID查询单条数据
     *
     * @param policyId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceInsurContract queryById(Integer policyId) {
        return this.insuranceInsurContractDao.queryById(policyId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceInsurContract> queryAllByLimit(int offset, int limit) {
        return this.insuranceInsurContractDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceInsurContract 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceInsurContract insert(InsuranceInsurContract insuranceInsurContract) {
        this.insuranceInsurContractDao.insert(insuranceInsurContract);
        return insuranceInsurContract;
    }

    /**
     * 修改数据
     *
     * @param insuranceInsurContract 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceInsurContract update(InsuranceInsurContract insuranceInsurContract) {
        this.insuranceInsurContractDao.update(insuranceInsurContract);
        return this.queryById(insuranceInsurContract.getPolicyId());
    }

    /**
     * 通过主键删除数据
     *
     * @param policyId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer policyId) {
        return this.insuranceInsurContractDao.deleteById(policyId) > 0;
    }
}