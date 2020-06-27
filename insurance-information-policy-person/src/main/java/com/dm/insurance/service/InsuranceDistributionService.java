package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceDistribution;
import java.util.List;

/**
 * 配送表(InsuranceDistribution)表服务接口
 *
 * @author makejava
 * @since 2020-06-26 13:36:38
 */
public interface InsuranceDistributionService {

    /**
     * 通过ID查询单条数据
     *
     * @param distributionId 主键
     * @return 实例对象
     */
    InsuranceDistribution queryById(Integer distributionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceDistribution> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceDistribution 实例对象
     * @return 实例对象
     */
    InsuranceDistribution insert(InsuranceDistribution insuranceDistribution);

    /**
     * 修改数据
     *
     * @param insuranceDistribution 实例对象
     * @return 实例对象
     */
    InsuranceDistribution update(InsuranceDistribution insuranceDistribution);

    /**
     * 通过主键删除数据
     *
     * @param distributionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer distributionId);

}