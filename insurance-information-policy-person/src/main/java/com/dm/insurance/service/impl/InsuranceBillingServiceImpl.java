package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceBilling;
import com.dm.insurance.dao.InsuranceBillingDao;
import com.dm.insurance.service.InsuranceBillingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 开票表(InsuranceBilling)表服务实现类
 *
 * @author makejava
 * @since 2020-06-26 13:36:20
 */
@Service("insuranceBillingService")
public class InsuranceBillingServiceImpl implements InsuranceBillingService {
    @Resource
    private InsuranceBillingDao insuranceBillingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param billingId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceBilling queryById(Integer billingId) {
        return this.insuranceBillingDao.queryById(billingId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceBilling> queryAllByLimit(int offset, int limit) {
        return this.insuranceBillingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceBilling 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceBilling insert(InsuranceBilling insuranceBilling) {
        this.insuranceBillingDao.insert(insuranceBilling);
        return insuranceBilling;
    }

    /**
     * 修改数据
     *
     * @param insuranceBilling 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceBilling update(InsuranceBilling insuranceBilling) {
        this.insuranceBillingDao.update(insuranceBilling);
        return this.queryById(insuranceBilling.getBillingId());
    }

    /**
     * 通过主键删除数据
     *
     * @param billingId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer billingId) {
        return this.insuranceBillingDao.deleteById(billingId) > 0;
    }
}