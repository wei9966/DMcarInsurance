package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceCity;
import com.dm.insurance.dao.InsuranceCityDao;
import com.dm.insurance.service.InsuranceCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 统一地区库(InsuranceCity)表服务实现类
 *
 * @author makejava
 * @since 2020-06-24 16:23:32
 */
@Service("insuranceCityService")
public class InsuranceCityServiceImpl implements InsuranceCityService {
    @Resource
    private InsuranceCityDao insuranceCityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param baseAreaid 主键
     * @return 实例对象
     */
    @Override
    public InsuranceCity queryById(Integer baseAreaid) {
        return this.insuranceCityDao.queryById(baseAreaid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceCity> queryAllByLimit(int offset, int limit) {
        return this.insuranceCityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceCity 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceCity insert(InsuranceCity insuranceCity) {
        this.insuranceCityDao.insert(insuranceCity);
        return insuranceCity;
    }

    /**
     * 修改数据
     *
     * @param insuranceCity 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceCity update(InsuranceCity insuranceCity) {
        this.insuranceCityDao.update(insuranceCity);
        return this.queryById(insuranceCity.getBaseAreaid());
    }

    /**
     * 通过主键删除数据
     *
     * @param baseAreaid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer baseAreaid) {
        return this.insuranceCityDao.deleteById(baseAreaid) > 0;
    }
}