package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceCarInfo;
import com.dm.insurance.dao.InsuranceCarInfoDao;
import com.dm.insurance.service.InsuranceCarInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆信息表(InsuranceCarInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-06-29 12:51:43
 */
@Service("insuranceCarInfoService")
public class InsuranceCarInfoServiceImpl implements InsuranceCarInfoService {
    @Resource
    private InsuranceCarInfoDao insuranceCarInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param carInfoId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceCarInfo queryById(Integer carInfoId) {
        return this.insuranceCarInfoDao.queryById(carInfoId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceCarInfo> queryAllByLimit(int offset, int limit) {
        return this.insuranceCarInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceCarInfo 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceCarInfo insert(InsuranceCarInfo insuranceCarInfo) {
        this.insuranceCarInfoDao.insert(insuranceCarInfo);
        return insuranceCarInfo;
    }

    /**
     * 修改数据
     *
     * @param insuranceCarInfo 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceCarInfo update(InsuranceCarInfo insuranceCarInfo) {
        this.insuranceCarInfoDao.update(insuranceCarInfo);
        return this.queryById(insuranceCarInfo.getCarInfoId());
    }

    /**
     * 通过主键删除数据
     *
     * @param carInfoId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer carInfoId) {
        return this.insuranceCarInfoDao.deleteById(carInfoId) > 0;
    }
}