package com.dm.insurance.service.impl;

import cn.hutool.Hutool;
import cn.hutool.crypto.digest.MD5;
import com.dm.insurance.dao.InsuranceLoginDao;
import com.dm.insurance.entity.InsuranceLogin;
import com.dm.insurance.entity.InsuranceUser;
import com.dm.insurance.service.InsuranceLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (InsuranceLogin)表服务实现类
 *
 * @author wb
 * @since 2020-07-24 19:38:26
 */
@Service("insuranceLoginService")
public class InsuranceLoginServiceImpl implements InsuranceLoginService {
    @Resource
    private InsuranceLoginDao insuranceLoginDao;

    private  MD5 md5=new MD5();

    /**
     * 通过ID查询单条数据
     *
     * @param insuranceLoginId 主键
     * @return 实例对象
     */
    @Override
    public InsuranceLogin queryById(Integer insuranceLoginId) {
        return this.insuranceLoginDao.queryById(insuranceLoginId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<InsuranceLogin> queryAllByLimit(int offset, int limit) {
        return this.insuranceLoginDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param insuranceLogin 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceLogin insert(InsuranceLogin insuranceLogin) {
        InsuranceLogin insuranceLogin1 = this.insuranceLoginDao.queryPhone(insuranceLogin.getInsuranceLoginPhone());
        if (insuranceLogin1 == null) {
            insuranceLogin.setInsuranceLoginPassword(md5.digestHex16(insuranceLogin.getInsuranceLoginPassword()));
            this.insuranceLoginDao.insert(insuranceLogin);
            return insuranceLogin;
        } else {
            return insuranceLogin1;
        }
    }

    /**
     * 修改数据
     *
     * @param insuranceLogin 实例对象
     * @return 实例对象
     */
    @Override
    public InsuranceLogin update(InsuranceLogin insuranceLogin) {
        this.insuranceLoginDao.update(insuranceLogin);
        return this.queryById(insuranceLogin.getInsuranceLoginId());
    }

    /**
     * 通过主键删除数据
     *
     * @param insuranceLoginId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer insuranceLoginId) {
        return this.insuranceLoginDao.deleteById(insuranceLoginId) > 0;
    }

    /**
     * 通过手机号验证码登录
     *
     * @param userPhone
     * @return 是否登录成功
     */
    @Override
    public InsuranceLogin phoneCodeLogin(String userPhone) {
        InsuranceLogin insuranceLogin = this.insuranceLoginDao.phoneCodeLogin(userPhone);
        return insuranceLogin;
    }

    /**
     * 通过手机号登录
     *
     * @param userPhone
     * @param userPass
     * @return 是否登录成功
     */
    @Override
    public InsuranceLogin phoneLogin(String userPhone, String userPass) {
        InsuranceLogin insuranceLogin = this.insuranceLoginDao.phoneLogin(userPhone, md5.digestHex(userPass));
        return insuranceLogin;
    }

    /**
     * 通过用户名登录
     *
     * @param userName
     * @param userPass
     * @return 是否登录成功
     */
    @Override
    public InsuranceLogin nameLogin(String userName, String userPass) {
        InsuranceLogin insuranceLogin = this.insuranceLoginDao.nameLogin(userName, md5.digestHex(userPass));
        return insuranceLogin;
    }

    /**
     * 通过邮箱登录
     *
     * @param userEmail
     * @param userPass
     * @return 是否登录成功
     */
    @Override
    public InsuranceLogin emailLogin(String userEmail, String userPass) {
        InsuranceLogin insuranceLogin = this.insuranceLoginDao.emailLogin(userEmail, md5.digestHex(userPass));
        return insuranceLogin;
    }

    /**
     * 通过邮箱登录
     *
     * @param userPhone
     * @return 是否登录成功
     */
    @Override
    public InsuranceLogin queryPhone(String userPhone) {
        InsuranceLogin insuranceLogin = this.insuranceLoginDao.queryPhone(userPhone);
        return insuranceLogin;
    }

    /**
     * 查询账号
     *
     * @param userPhone
     * @param userEmail
     * @param userName
     * @return ID
     */
    @Override
    public InsuranceLogin queryId(String userPhone, String userEmail, String userName) {
        InsuranceLogin insuranceLogin = this.insuranceLoginDao.queryId(userPhone, userEmail, userName);
        return insuranceLogin;
    }

    @Override
    public InsuranceLogin queryName(String userName, String userPass) {
        InsuranceLogin dbUser=this.insuranceLoginDao.queryName(userName,md5.digestHex(userPass));
        return dbUser;
    }

    @Override
    public InsuranceLogin queryEmail(String email) {
        InsuranceLogin insuranceLogin = this.insuranceLoginDao.queryEmail(email);
        return insuranceLogin;
    }
}