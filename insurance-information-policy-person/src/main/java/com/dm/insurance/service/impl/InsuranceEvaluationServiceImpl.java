package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceEvaluation;
import com.dm.insurance.dao.InsuranceEvaluationDao;
import com.dm.insurance.service.InsuranceEvaluationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InsuranceEvaluation)表服务实现类
 *
 * @author wb
 * @since 2020-07-12 14:38:10
 */
@Service("insuranceEvaluationService")
public class InsuranceEvaluationServiceImpl implements InsuranceEvaluationService {
    @Resource
    private InsuranceEvaluationDao insuranceEvaluationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param evaluationId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceEvaluation queryById(Integer evaluationId) {
        return this.insuranceEvaluationDao.queryById(evaluationId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceEvaluation> queryAllByLimit(int offset, int limit) {
        return this.insuranceEvaluationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceEvaluation 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceEvaluation insert(InsuranceEvaluation insuranceEvaluation) {
        this.insuranceEvaluationDao.insert(insuranceEvaluation);
        return insuranceEvaluation;
    }

    /**
     * 修改数据
     *
     * @param insuranceEvaluation 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceEvaluation update(InsuranceEvaluation insuranceEvaluation) {
        this.insuranceEvaluationDao.update(insuranceEvaluation);
        return this.queryById(insuranceEvaluation.getEvaluationId());
    }

    /**
     * 通过主键删除数据
     *
     * @param evaluationId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer evaluationId) {
        return this.insuranceEvaluationDao.deleteById(evaluationId) > 0;
    }
}