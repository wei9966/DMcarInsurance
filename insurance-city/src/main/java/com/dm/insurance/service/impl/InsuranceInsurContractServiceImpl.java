package com.dm.insurance.service.impl;

import com.dm.insurance.dao.InsuranceInsurContractDao;
import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.service.InsuranceInsurContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceInsurContractServiceImpl implements InsuranceInsurContractService {

    @Autowired
    private InsuranceInsurContractDao insuranceInsurContractDao;


    @Override
    public InsuranceInsurContract getContract(String phone) {
        return this.insuranceInsurContractDao.getInsurContract(phone);
    }
}
