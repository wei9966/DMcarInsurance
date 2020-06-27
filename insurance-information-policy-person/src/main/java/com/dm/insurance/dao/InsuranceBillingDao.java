package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceBilling;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 开票表(InsuranceBilling)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-26 13:36:20
 */
public interface InsuranceBillingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param billingId 主键
     * @return 实例对象
     */
    InsuranceBilling queryById(Integer billingId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceBilling> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceBilling 实例对象
     * @return 对象列表
     */
    List<InsuranceBilling> queryAll(InsuranceBilling insuranceBilling);

    /**
     * 新增数据
     *
     * @param insuranceBilling 实例对象
     * @return 影响行数
     */
    int insert(InsuranceBilling insuranceBilling);

    /**
     * 修改数据
     *
     * @param insuranceBilling 实例对象
     * @return 影响行数
     */
    int update(InsuranceBilling insuranceBilling);

    /**
     * 通过主键删除数据
     *
     * @param billingId 主键
     * @return 影响行数
     */
    int deleteById(Integer billingId);

}