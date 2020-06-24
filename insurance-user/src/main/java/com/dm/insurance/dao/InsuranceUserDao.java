package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户表(InsuranceUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-24 17:51:46
 */
public interface InsuranceUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    InsuranceUser queryById(Integer userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceUser 实例对象
     * @return 对象列表
     */
    List<InsuranceUser> queryAll(InsuranceUser insuranceUser);

    /**
     * 新增数据
     *
     * @param insuranceUser 实例对象
     * @return 影响行数
     */
    int insert(InsuranceUser insuranceUser);

    /**
     * 修改数据
     *
     * @param insuranceUser 实例对象
     * @return 影响行数
     */
    int update(InsuranceUser insuranceUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

}