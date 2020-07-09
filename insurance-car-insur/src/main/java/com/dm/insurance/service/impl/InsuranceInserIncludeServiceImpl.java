package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceInserInclude;
import com.dm.insurance.dao.InsuranceInserIncludeDao;
import com.dm.insurance.service.InsuranceInserIncludeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 套餐清单(InsuranceInserInclude)表服务实现类
 *
 * @author makejava
 * @since 2020-06-27 11:09:43
 */
@Service("insuranceInserIncludeService")
public class InsuranceInserIncludeServiceImpl implements InsuranceInserIncludeService {
    @Resource
    private InsuranceInserIncludeDao insuranceInserIncludeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param iiId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceInserInclude queryById(Integer iiId) {
        return this.insuranceInserIncludeDao.queryById(iiId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceInserInclude> queryAllByLimit(int offset, int limit) {
        return this.insuranceInserIncludeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceInserInclude 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceInserInclude insert(InsuranceInserInclude insuranceInserInclude) {
        this.insuranceInserIncludeDao.insert(insuranceInserInclude);
        return insuranceInserInclude;
    }

    /**
     * 修改数据
     *
     * @param insuranceInserInclude 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceInserInclude update(InsuranceInserInclude insuranceInserInclude) {
        this.insuranceInserIncludeDao.update(insuranceInserInclude);
        return this.queryById(insuranceInserInclude.getIiId());
    }

    /**
     * 通过主键删除数据
     *
     * @param iiId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer iiId) {

        return this.insuranceInserIncludeDao.deleteById(iiId) > 0;
    }

}