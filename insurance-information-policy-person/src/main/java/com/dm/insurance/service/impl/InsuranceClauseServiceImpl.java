package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceClause;
import com.dm.insurance.dao.InsuranceClauseDao;
import com.dm.insurance.service.InsuranceClauseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InsuranceClause)表服务实现类
 *
 * @author makejava
 * @since 2020-06-26 13:36:54
 */
@Service("insuranceClauseService")
public class InsuranceClauseServiceImpl implements InsuranceClauseService {
    @Resource
    private InsuranceClauseDao insuranceClauseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param clauseId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceClause queryById(Integer clauseId) {
        return this.insuranceClauseDao.queryById(clauseId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceClause> queryAllByLimit(int offset, int limit) {
        return this.insuranceClauseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceClause 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceClause insert(InsuranceClause insuranceClause) {
        this.insuranceClauseDao.insert(insuranceClause);
        return insuranceClause;
    }

    /**
     * 修改数据
     *
     * @param insuranceClause 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceClause update(InsuranceClause insuranceClause) {
        this.insuranceClauseDao.update(insuranceClause);
        return this.queryById(insuranceClause.getClauseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param clauseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer clauseId) {
        return this.insuranceClauseDao.deleteById(clauseId) > 0;
    }
}