package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceCity;
import java.util.List;

/**
 * 统一地区库(InsuranceCity)表服务接口
 *
 * @author makejava
 * @since 2020-06-24 16:23:32
 */
public interface InsuranceCityService {

    /**
     * 通过ID查询单条数据
     *
     * @param baseAreaid 主键
     * @return 实例对象
     */
    InsuranceCity queryById(Integer baseAreaid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceCity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceCity 实例对象
     * @return 实例对象
     */
    InsuranceCity insert(InsuranceCity insuranceCity);

    /**
     * 修改数据
     *
     * @param insuranceCity 实例对象
     * @return 实例对象
     */
    InsuranceCity update(InsuranceCity insuranceCity);

    /**
     * 通过主键删除数据
     *
     * @param baseAreaid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer baseAreaid);

}