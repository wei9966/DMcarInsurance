package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceCarInsur;
import com.dm.insurance.dao.InsuranceCarInsurDao;
import com.dm.insurance.service.InsuranceCarInsurService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 保险信息表(InsuranceCarInsur)表服务实现类
 *
 * @author makejava
 * @since 2020-06-24 16:35:45
 */
@Service("insuranceCarInsurService")
public class InsuranceCarInsurServiceImpl implements InsuranceCarInsurService {
    @Resource
    private InsuranceCarInsurDao insuranceCarInsurDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ciId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceCarInsur queryById(Integer ciId) {
        return this.insuranceCarInsurDao.queryById(ciId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceCarInsur> queryAllByLimit(int offset, int limit) {
        return this.insuranceCarInsurDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceCarInsur 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceCarInsur insert(InsuranceCarInsur insuranceCarInsur) {
        this.insuranceCarInsurDao.insert(insuranceCarInsur);
        return insuranceCarInsur;
    }

    /**
     * 修改数据
     *
     * @param insuranceCarInsur 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceCarInsur update(InsuranceCarInsur insuranceCarInsur) {
        this.insuranceCarInsurDao.update(insuranceCarInsur);
        return this.queryById(insuranceCarInsur.getCiId());
    }

    /**
     * 通过主键删除数据
     *
     * @param ciId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ciId) {
        return this.insuranceCarInsurDao.deleteById(ciId) > 0;
    }
}