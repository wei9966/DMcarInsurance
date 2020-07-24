package com.dm.insurance.controller;

import com.dm.insurance.entity.InsuranceInsurContract;
import com.dm.insurance.entity.R;
import com.dm.insurance.service.InsuranceInsurContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insuranceCity/insuranceUserInfo")
public class InsuranceGetUserInfo {

    @Autowired
    private InsuranceInsurContractService insuranceInsurContractService;

    @RequestMapping("/infoByPhone")
    public InsuranceInsurContract getUserInfoByPhone(@RequestParam("phone") String phone){
        InsuranceInsurContract contract = this.insuranceInsurContractService.getContract(phone);
        return contract;
    }
}
