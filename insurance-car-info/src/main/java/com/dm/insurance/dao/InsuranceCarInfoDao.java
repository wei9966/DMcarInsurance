package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceCarInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 车辆信息表(InsuranceCarInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-28 09:02:28
 */
@Mapper
public interface InsuranceCarInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param carInfoId 主键
     * @return 实例对象
     */
    InsuranceCarInfo queryById(Integer carInfoId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceCarInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceCarInfo 实例对象
     * @return 对象列表
     */
    List<InsuranceCarInfo> queryAll(InsuranceCarInfo insuranceCarInfo);

    /**
     * 新增数据
     *
     * @param insuranceCarInfo 实例对象
     * @return 影响行数
     */
    int insert(InsuranceCarInfo insuranceCarInfo);

    /**
     * 修改数据
     *
     * @param insuranceCarInfo 实例对象
     * @return 影响行数
     */
    int update(InsuranceCarInfo insuranceCarInfo);

    /**
     * 通过主键删除数据
     *
     * @param carInfoId 主键
     * @return 影响行数
     */
    int deleteById(Integer carInfoId);



}