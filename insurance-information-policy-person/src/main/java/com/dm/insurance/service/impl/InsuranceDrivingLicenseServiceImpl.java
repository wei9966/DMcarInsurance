package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceDrivingLicense;
import com.dm.insurance.dao.InsuranceDrivingLicenseDao;
import com.dm.insurance.service.InsuranceDrivingLicenseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 行驶证车主表(InsuranceDrivingLicense)表服务实现类
 *
 * @author makejava
 * @since 2020-06-26 13:35:59
 */
@Service("insuranceDrivingLicenseService")
public class InsuranceDrivingLicenseServiceImpl implements InsuranceDrivingLicenseService {
    @Resource
    private InsuranceDrivingLicenseDao insuranceDrivingLicenseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param drivingLicenseId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceDrivingLicense queryById(Integer drivingLicenseId) {
        return this.insuranceDrivingLicenseDao.queryById(drivingLicenseId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceDrivingLicense> queryAllByLimit(int offset, int limit) {
        return this.insuranceDrivingLicenseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceDrivingLicense 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceDrivingLicense insert(InsuranceDrivingLicense insuranceDrivingLicense) {
        this.insuranceDrivingLicenseDao.insert(insuranceDrivingLicense);
        return insuranceDrivingLicense;
    }

    /**
     * 修改数据
     *
     * @param insuranceDrivingLicense 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceDrivingLicense update(InsuranceDrivingLicense insuranceDrivingLicense) {
        this.insuranceDrivingLicenseDao.update(insuranceDrivingLicense);
        return this.queryById(insuranceDrivingLicense.getDrivingLicenseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param drivingLicenseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer drivingLicenseId) {
        return this.insuranceDrivingLicenseDao.deleteById(drivingLicenseId) > 0;
    }
}