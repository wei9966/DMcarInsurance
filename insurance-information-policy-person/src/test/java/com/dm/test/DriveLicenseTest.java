package com.dm.test;

import com.dm.insurance.PolicyPersonInformation;
import com.dm.insurance.dao.InsuranceDrivingLicenseDao;
import com.dm.insurance.entity.InsuranceDrivingLicense;
import com.dm.insurance.service.InsuranceDrivingLicenseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Create By WeiBin on 2020/6/26 22:49
 */
@SpringBootTest(classes = PolicyPersonInformation.class)
public class DriveLicenseTest {

    @Autowired
    private InsuranceDrivingLicenseService insuranceDrivingLicenseService;

    @Test
    public void test1(){
        InsuranceDrivingLicense insuranceDrivingLicense=new InsuranceDrivingLicense();
        insuranceDrivingLicense.setDrivingLicenseCard("430666616161");
        insuranceDrivingLicense.setDrivingLicenseName("王五");
        InsuranceDrivingLicense insert = insuranceDrivingLicenseService.insert(insuranceDrivingLicense);
        System.out.println("添加后的结果"+insert);
    }

}
