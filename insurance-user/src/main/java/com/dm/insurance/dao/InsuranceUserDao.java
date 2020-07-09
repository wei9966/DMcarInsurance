package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * 用户表(InsuranceUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-24 17:51:46
 */
@Mapper
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

    /**
     * 通过手机号验证码登录
     *
     * @param userPhone
     * @return 是否登录成功
     * */
    InsuranceUser phoneCodeLogin(String userPhone);

    /**
     * 通过手机号登录
     *
     * @param userPhone
     * @param userPass
     * @return 是否登录成功
     * */
    InsuranceUser phoneLogin(@Param("userPhone") String userPhone,@Param("userPass") String userPass);

    /**
     * 通过用户名登录
     *
     * @param userName
     * @param userPass
     * @return 是否登录成功
     * */
    InsuranceUser nameLogin(@Param("userName") String userName,@Param("userPass") String userPass);

    /**
     * 通过邮箱登录
     *
     * @param userEmail
     * @param userPass
     * @return 是否登录成功
     * */
    InsuranceUser emailLogin(@Param("userEmail") String userEmail,@Param("userPass") String userPass);

    /**
     * 查询是否存在该手机号
     *
     * @param userPhone
     * @return 是否存在
     * */
    InsuranceUser queryPhone(@Param("userPhone") String userPhone);

    /**
     * 查询账号
     *
     * @param userPhone
     * @param userEmail
     * @param userName
     * @return ID
     * */
    InsuranceUser queryId(@Param("userPhone") String userPhone,@Param("userEmail") String userEmail,@Param("userName") String userName);
}