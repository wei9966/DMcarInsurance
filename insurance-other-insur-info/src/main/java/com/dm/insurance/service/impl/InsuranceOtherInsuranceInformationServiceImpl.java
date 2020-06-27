package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceOtherInsuranceInformation;
import com.dm.insurance.dao.InsuranceOtherInsuranceInformationDao;
import com.dm.insurance.service.InsuranceOtherInsuranceInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InsuranceOtherInsuranceInformation)表服务实现类
 *
 * @author makejava
 * @since 2020-06-24 17:26:32
 */
@Service("insuranceOtherInsuranceInformationService")
public class InsuranceOtherInsuranceInformationServiceImpl implements InsuranceOtherInsuranceInformationService {
    @Resource
    private InsuranceOtherInsuranceInformationDao insuranceOtherInsuranceInformationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param otherInsuranceInformationId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceOtherInsuranceInformation queryById(Integer otherInsuranceInformationId) {
        return this.insuranceOtherInsuranceInformationDao.queryById(otherInsuranceInformationId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceOtherInsuranceInformation> queryAllByLimit(int offset, int limit) {
        return this.insuranceOtherInsuranceInformationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceOtherInsuranceInformation 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceOtherInsuranceInformation insert(InsuranceOtherInsuranceInformation insuranceOtherInsuranceInformation) {
        this.insuranceOtherInsuranceInformationDao.insert(insuranceOtherInsuranceInformation);
        return insuranceOtherInsuranceInformation;
    }

    /**
     * 修改数据
     *
     * @param insuranceOtherInsuranceInformation 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceOtherInsuranceInformation update(InsuranceOtherInsuranceInformation insuranceOtherInsuranceInformation) {
        this.insuranceOtherInsuranceInformationDao.update(insuranceOtherInsuranceInformation);
        return this.queryById(insuranceOtherInsuranceInformation.getOtherInsuranceInformationId());
    }

    /**
     * 通过主键删除数据
     *
     * @param otherInsuranceInformationId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer otherInsuranceInformationId) {
        return this.insuranceOtherInsuranceInformationDao.deleteById(otherInsuranceInformationId) > 0;
    }
}