package com.dm.insurance.service;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Create By WeiBin on 2020/7/3 14:19
 *
 * @author WB
 */
@Service
public class MessageService {
    private String accessKeyId = "LTAI4GHCinpE7n";
    private String accessSecret = "KJgmes9RgeOiEds6oKYI";
    public static String pNumber = null;

    public void SendMessage(String phoneNumber) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);
        String checkCode = String.valueOf(new Random().nextInt(899990) + 100000);
        pNumber = checkCode;
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        request.putQueryParameter("SignName", "缔梦专用");
        request.putQueryParameter("TemplateCode", "SMS_186400812");
        request.putQueryParameter("TemplateParam", "{\"code\":" + checkCode + "}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
