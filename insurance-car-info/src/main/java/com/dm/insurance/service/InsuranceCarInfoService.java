package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceCarInfo;
import java.util.List;

/**
 * 车辆信息表(InsuranceCarInfo)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 09:02:30
 */
public interface InsuranceCarInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param carInfoId 主键
     * @return 实例对象
     */
    InsuranceCarInfo queryById(Integer carInfoId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceCarInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceCarInfo 实例对象
     * @return 实例对象
     */
    InsuranceCarInfo insert(InsuranceCarInfo insuranceCarInfo);

    /**
     * 修改数据
     *
     * @param insuranceCarInfo 实例对象
     * @return 实例对象
     */
    InsuranceCarInfo update(InsuranceCarInfo insuranceCarInfo);

    /**
     * 通过主键删除数据
     *
     * @param carInfoId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer carInfoId);

}