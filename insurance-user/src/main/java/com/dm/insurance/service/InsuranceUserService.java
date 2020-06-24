package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceUser;
import java.util.List;

/**
 * 用户表(InsuranceUser)表服务接口
 *
 * @author makejava
 * @since 2020-06-24 17:51:47
 */
public interface InsuranceUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    InsuranceUser queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceUser 实例对象
     * @return 实例对象
     */
    InsuranceUser insert(InsuranceUser insuranceUser);

    /**
     * 修改数据
     *
     * @param insuranceUser 实例对象
     * @return 实例对象
     */
    InsuranceUser update(InsuranceUser insuranceUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

}