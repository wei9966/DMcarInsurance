package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceCarInsur;
import java.util.List;

/**
 * 保险信息表(InsuranceCarInsur)表服务接口
 *
 * @author makejava
 * @since 2020-06-24 14:40:22
 */
public interface InsuranceCarInsurService {

    /**
     * 通过ID查询单条数据
     *
     * @param ciId 主键
     * @return 实例对象
     */
    InsuranceCarInsur queryById(Integer ciId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceCarInsur> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceCarInsur 实例对象
     * @return 实例对象
     */
    InsuranceCarInsur insert(InsuranceCarInsur insuranceCarInsur);

    /**
     * 修改数据
     *
     * @param insuranceCarInsur 实例对象
     * @return 实例对象
     */
    InsuranceCarInsur update(InsuranceCarInsur insuranceCarInsur);

    /**
     * 通过主键删除数据
     *
     * @param ciId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ciId);

}