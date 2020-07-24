package com.dm.insurance.dao;

import com.dm.insurance.entity.InsuranceInsurContract;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InsuranceInsurContractDao {


    public InsuranceInsurContract getInsurContract(@Param("phone") String phone);

}
