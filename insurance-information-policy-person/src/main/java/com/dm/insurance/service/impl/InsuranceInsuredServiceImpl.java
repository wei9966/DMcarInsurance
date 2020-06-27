package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceInsured;
import com.dm.insurance.dao.InsuranceInsuredDao;
import com.dm.insurance.service.InsuranceInsuredService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 被保险人表(InsuranceInsured)表服务实现类
 *
 * @author makejava
 * @since 2020-06-26 13:35:35
 */
@Service("insuranceInsuredService")
public class InsuranceInsuredServiceImpl implements InsuranceInsuredService {
    @Resource
    private InsuranceInsuredDao insuranceInsuredDao;

    /**
     * 通过ID查询单条数据
     *
     * @param insuredId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceInsured queryById(Integer insuredId) {
        return this.insuranceInsuredDao.queryById(insuredId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceInsured> queryAllByLimit(int offset, int limit) {
        return this.insuranceInsuredDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceInsured 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceInsured insert(InsuranceInsured insuranceInsured) {
        this.insuranceInsuredDao.insert(insuranceInsured);
        return insuranceInsured;
    }

    /**
     * 修改数据
     *
     * @param insuranceInsured 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceInsured update(InsuranceInsured insuranceInsured) {
        this.insuranceInsuredDao.update(insuranceInsured);
        return this.queryById(insuranceInsured.getInsuredId());
    }

    /**
     * 通过主键删除数据
     *
     * @param insuredId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer insuredId) {
        return this.insuranceInsuredDao.deleteById(insuredId) > 0;
    }
}