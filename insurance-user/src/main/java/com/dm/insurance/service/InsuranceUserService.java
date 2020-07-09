package com.dm.insurance.service;

import com.dm.insurance.entity.InsuranceUser;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 通过手机号验证码登录
     *
     * @param userPhone
     * @return 是否登录成功
     * */
    InsuranceUser phoneCodeLogin( String userPhone);

    /**
     * 通过手机号登录
     *
     * @param userPhone
     * @param userPass
     * @return 是否登录成功
     * */
    InsuranceUser phoneLogin( String userPhone,  String userPass);

    /**
     * 通过用户名登录
     *
     * @param userName
     * @param userPass
     * @return 是否登录成功
     * */
    InsuranceUser nameLogin(String userName, String userPass);

    /**
     * 通过邮箱登录
     *
     * @param userEmail
     * @param userPass
     * @return 是否登录成功
     * */
    InsuranceUser emailLogin( String userEmail,String userPass);

    /**
     * 查询是否存在该手机号
     *
     * @param userPhone
     * @return 是否登录成功
     * */
    InsuranceUser queryPhone(String userPhone);

    /**
     * 查询账号
     *
     * @param userPhone
     * @param userEmail
     * @param userName
     * @return ID
     * */
    InsuranceUser queryId( String userPhone,String userEmail,String userName);
}