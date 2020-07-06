package com.dm.insurance.service.impl;

import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.dao.InsuranceUserDao;
import com.dm.insurance.service.InsuranceUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(InsuranceUser)表服务实现类
 *
 * @author makejava
 * @since 2020-06-24 17:51:48
 */
@Service("insuranceUserService")
public class InsuranceUserServiceImpl implements InsuranceUserService {
  @Resource private InsuranceUserDao insuranceUserDao;

  /**
   * 通过ID查询单条数据
   *
   * @param userId 主键
   * @return 实例对象
   */
  @Override
  public InsuranceUser queryById(Integer userId) {
    return this.insuranceUserDao.queryById(userId);
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<InsuranceUser> queryAllByLimit(int offset, int limit) {
    return this.insuranceUserDao.queryAllByLimit(offset, limit);
  }

  /**
   * 新增数据
   *
   * @param insuranceUser 实例对象
   * @return 实例对象
   */
  @Override
  public InsuranceUser insert(InsuranceUser insuranceUser) {
    InsuranceUser insuranceUser1 = this.insuranceUserDao.queryPhone(insuranceUser.getUserPhone());
    if (insuranceUser1 == null) {
      this.insuranceUserDao.insert(insuranceUser);
      return insuranceUser;
    } else {
      return insuranceUser1;
    }
  }

  /**
   * 修改数据
   *
   * @param insuranceUser 实例对象
   * @return 实例对象
   */
  @Override
  public InsuranceUser update(InsuranceUser insuranceUser) {
    this.insuranceUserDao.update(insuranceUser);
    return this.queryById(insuranceUser.getUserId());
  }

  /**
   * 通过主键删除数据
   *
   * @param userId 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer userId) {
    return this.insuranceUserDao.deleteById(userId) > 0;
  }

  /**
   * 通过手机号验证码登录
   *
   * @param userPhone
   * @return 是否登录成功
   */
  @Override
  public InsuranceUser phoneCodeLogin(String userPhone) {
    InsuranceUser insuranceUser = this.insuranceUserDao.phoneCodeLogin(userPhone);
    return insuranceUser;
  }

  /**
   * 通过手机号登录
   *
   * @param userPhone
   * @param userPass
   * @return 是否登录成功
   */
  @Override
  public InsuranceUser phoneLogin(String userPhone, String userPass) {
    InsuranceUser insuranceUser = this.insuranceUserDao.phoneLogin(userPhone, userPass);
    return insuranceUser;
  }

  /**
   * 通过用户名登录
   *
   * @param userName
   * @param userPass
   * @return 是否登录成功
   */
  @Override
  public InsuranceUser nameLogin(String userName, String userPass) {
    InsuranceUser insuranceUser = this.insuranceUserDao.nameLogin(userName, userPass);
    return insuranceUser;
  }

  /**
   * 通过邮箱登录
   *
   * @param userEmail
   * @param userPass
   * @return 是否登录成功
   */
  @Override
  public InsuranceUser emailLogin(String userEmail, String userPass) {
    InsuranceUser insuranceUser = this.insuranceUserDao.emailLogin(userEmail, userPass);
    return insuranceUser;
  }

  /**
   * 通过邮箱登录
   *
   * @param userPhone
   * @return 是否登录成功
   */
  @Override
  public InsuranceUser queryPhone(String userPhone) {
    InsuranceUser insuranceUser = this.insuranceUserDao.queryPhone(userPhone);
    return insuranceUser;
  }

  /**
   * 查询账号
   *
   * @param userPhone
   * @param userEmail
   * @param userName
   * @return ID
   * */
  @Override
  public InsuranceUser queryId(String userPhone, String userEmail, String userName) {
    InsuranceUser insuranceUser=this.insuranceUserDao.queryId(userPhone,userEmail,userName);

    return insuranceUser;
  }
}
