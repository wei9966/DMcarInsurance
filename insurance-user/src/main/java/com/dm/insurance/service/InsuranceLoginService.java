package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceLogin;
import com.dm.insurance.entity.InsuranceLogin;

import java.util.List;

/**
 * (InsuranceLogin)表服务接口
 *
 * @author wb
 * @since 2020-07-24 19:38:26
 */
public interface InsuranceLoginService {

    /**
     * 通过ID查询单条数据
     *
     * @param insuranceLoginId 主键
     * @return 实例对象
     */
    InsuranceLogin queryById(Integer insuranceLoginId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InsuranceLogin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param insuranceLogin 实例对象
     * @return 实例对象
     */
    InsuranceLogin insert(InsuranceLogin insuranceLogin);

    /**
     * 修改数据
     *
     * @param insuranceLogin 实例对象
     * @return 实例对象
     */
    InsuranceLogin update(InsuranceLogin insuranceLogin);

    /**
     * 通过主键删除数据
     *
     * @param insuranceLoginId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer insuranceLoginId);

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
    InsuranceLogin phoneLogin(String userPhone, String userPass);

    /**
     * 通过用户名登录
     *
     * @param userName
     * @param userPass
     * @return 是否登录成功
     */
    InsuranceLogin nameLogin(String userName, String userPass);

    /**
     * 通过邮箱登录
     *
     * @param userEmail
     * @param userPass
     * @return 是否登录成功
     */
    InsuranceLogin emailLogin(String userEmail, String userPass);

    /**
     * 查询是否存在该手机号
     *
     * @param userPhone
     * @return 是否登录成功
     */
    InsuranceLogin queryPhone(String userPhone);

    /**
     * 查询账号
     *
     * @param userPhone
     * @param userEmail
     * @param userName
     * @return ID
     */
    InsuranceLogin queryId(String userPhone, String userEmail, String userName);
    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    InsuranceLogin queryName(String userName,String userPass);

    InsuranceLogin queryEmail(String email);
}