package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceDistribution;
import com.dm.insurance.dao.InsuranceDistributionDao;
import com.dm.insurance.service.InsuranceDistributionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 配送表(InsuranceDistribution)表服务实现类
 *
 * @author makejava
 * @since 2020-06-26 13:36:38
 */
@Service("insuranceDistributionService")
public class InsuranceDistributionServiceImpl implements InsuranceDistributionService {
    @Resource
    private InsuranceDistributionDao insuranceDistributionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param distributionId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceDistribution queryById(Integer distributionId) {
        return this.insuranceDistributionDao.queryById(distributionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceDistribution> queryAllByLimit(int offset, int limit) {
        return this.insuranceDistributionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceDistribution 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceDistribution insert(InsuranceDistribution insuranceDistribution) {
        this.insuranceDistributionDao.insert(insuranceDistribution);
        return insuranceDistribution;
    }

    /**
     * 修改数据
     *
     * @param insuranceDistribution 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceDistribution update(InsuranceDistribution insuranceDistribution) {
        this.insuranceDistributionDao.update(insuranceDistribution);
        return this.queryById(insuranceDistribution.getDistributionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param distributionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer distributionId) {
        return this.insuranceDistributionDao.deleteById(distributionId) > 0;
    }
}