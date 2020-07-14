package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsurancePersonnelInformation;
import com.dm.insurance.dao.InsurancePersonnelInformationDao;
import com.dm.insurance.service.InsurancePersonnelInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InsurancePersonnelInformation)表服务实现类
 *
 * @author wb
 * @since 2020-07-13 09:14:04
 */
@Service("insurancePersonnelInformationService")
public class InsurancePersonnelInformationServiceImpl implements InsurancePersonnelInformationService {
    @Resource
    private InsurancePersonnelInformationDao insurancePersonnelInformationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param personnelId 主键
     * @return 实例对象
     */
    @Override
    public InsurancePersonnelInformation queryById(Integer personnelId) {
        return this.insurancePersonnelInformationDao.queryById(personnelId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsurancePersonnelInformation> queryAllByLimit(int offset, int limit) {
        return this.insurancePersonnelInformationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insurancePersonnelInformation 实例对象
     * @return 实例对象
     */
    @Override
    public InsurancePersonnelInformation insert(InsurancePersonnelInformation insurancePersonnelInformation) {
        this.insurancePersonnelInformationDao.insert(insurancePersonnelInformation);
        return insurancePersonnelInformation;
    }

    /**
     * 修改数据
     *
     * @param insurancePersonnelInformation 实例对象
     * @return 实例对象
     */
    @Override
    public InsurancePersonnelInformation update(InsurancePersonnelInformation insurancePersonnelInformation) {
        this.insurancePersonnelInformationDao.update(insurancePersonnelInformation);
        return this.queryById(insurancePersonnelInformation.getPersonnelId());
    }

    /**
     * 通过主键删除数据
     *
     * @param personnelId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer personnelId) {
        return this.insurancePersonnelInformationDao.deleteById(personnelId) > 0;
    }
}