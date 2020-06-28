package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceCity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 统一地区库(InsuranceCity)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-24 16:23:31
 */
@Mapper
public interface InsuranceCityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param parentid
     * @return 实例对象
     */
    InsuranceCity queryById(Integer parentid);

    List<InsuranceCity> ListqueryById(@Param("parentid")Integer parentid);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceCity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceCity 实例对象
     * @return 对象列表
     */
    List<InsuranceCity> queryAll(InsuranceCity insuranceCity);

    /**
     * 新增数据
     *
     * @param insuranceCity 实例对象
     * @return 影响行数
     */
    int insert(InsuranceCity insuranceCity);

    /**
     * 修改数据
     *
     * @param insuranceCity 实例对象
     * @return 影响行数
     */
    int update(InsuranceCity insuranceCity);

    /**
     * 通过主键删除数据
     *
     * @param baseAreaid 主键
     * @return 影响行数
     */
    int deleteById(Integer baseAreaid);

}