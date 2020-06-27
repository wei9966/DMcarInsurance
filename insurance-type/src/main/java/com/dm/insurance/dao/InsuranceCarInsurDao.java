package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceCarInsur;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 保险信息表(InsuranceCarInsur)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-24 14:40:21
 */
@Mapper
public interface InsuranceCarInsurDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ciId 主键
     * @return 实例对象
     */
    InsuranceCarInsur queryById(Integer ciId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceCarInsur> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceCarInsur 实例对象
     * @return 对象列表
     */
    List<InsuranceCarInsur> queryAll(InsuranceCarInsur insuranceCarInsur);

    /**
     * 新增数据
     *
     * @param insuranceCarInsur 实例对象
     * @return 影响行数
     */
    int insert(InsuranceCarInsur insuranceCarInsur);

    /**
     * 修改数据
     *
     * @param insuranceCarInsur 实例对象
     * @return 影响行数
     */
    int update(InsuranceCarInsur insuranceCarInsur);

    /**
     * 通过主键删除数据
     *
     * @param ciId 主键
     * @return 影响行数
     */
    int deleteById(Integer ciId);

}