package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceLogin;
import com.dm.insurance.entity.InsuranceLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (InsuranceLogin)表数据库访问层
 *
 * @author wb
 * @since 2020-07-24 19:38:26
 */
@Mapper
public interface InsuranceLoginDao {

    /**
     * 通过ID查询单条数据
     *
     * @param insuranceLoginId 主键
     * @return 实例对象
     */
    InsuranceLogin queryById(Integer insuranceLoginId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceLogin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param insuranceLogin 实例对象
     * @return 对象列表
     */
    List<InsuranceLogin> queryAll(InsuranceLogin insuranceLogin);

    /**
     * 新增数据
     *
     * @param insuranceLogin 实例对象
     * @return 影响行数
     */
    int insert(InsuranceLogin insuranceLogin);

    /**
     * 修改数据
     *
     * @param insuranceLogin 实例对象
     * @return 影响行数
     */
    int update(InsuranceLogin insuranceLogin);

    /**
     * 通过主键删除数据
     *
     * @param insuranceLoginId 主键
     * @return 影响行数
     */
    int deleteById(Integer insuranceLoginId);

    /**
     * 通过手机号验证码登录
     *
     * @param userPhone
     * @return 是否登录成功
     */
    InsuranceLogin phoneCodeLogin(String userPhone);

    /**
     * 通过手机号登录
     *
     * @param userPhone
     * @param userPass
     * @return 是否登录成功
     */
    InsuranceLogin phoneLogin(@Param("userPhone") String userPhone, @Param("userPass") String userPass);

    /**
     * 通过用户名登录
     *
     * @param userName
     * @param userPass
     * @return 是否登录成功
     */
    InsuranceLogin nameLogin(@Param("userName") String userName, @Param("userPass") String userPass);

    /**
     * 通过邮箱登录
     *
     * @param userEmail
     * @param userPass
     * @return 是否登录成功
     */
    InsuranceLogin emailLogin(@Param("userEmail") String userEmail, @Param("userPass") String userPass);

    /**
     * 查询是否存在该手机号
     *
     * @param userPhone
     * @return 是否存在
     */
    InsuranceLogin queryPhone(@Param("userPhone") String userPhone);

    /**
     * 查询账号
     *
     * @param userPhone
     * @param userEmail
     * @param userName
     * @return ID
     */
    InsuranceLogin queryId(@Param("userPhone") String userPhone, @Param("userEmail") String userEmail, @Param("userName") String userName);

    /**
     *
     * @param userName
     * @param userPass
     * @return
     */
    InsuranceLogin queryName(@Param("userName") String userName, @Param("userPass") String userPass);

    /**
     * 判断邮箱是否存 在
     * @param email 邮箱
     * @return 是否存在用户
     */
    InsuranceLogin queryEmail(@Param("email") String email);
}