package com.dm.insurance.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Create By WeiBin on 2020/7/26 19:26
 * 车险日期工具类
 * @author WB
 */
public class InsuranceDateUtils {


    public static Date getNowDate(){
        try {
            return new Date();
        } catch (Exception e) {
            throw new RuntimeException("日期转换异常");
        }
    }

    /**
     * 计算保险截止日期
     * @return
     */
    public static Date getToDate(){
        try {
            Calendar instance = Calendar.getInstance();
            instance.add(Calendar.YEAR,1);
            System.out.println("获取的时间"+instance.getTime());
            return instance.getTime();
        } catch (Exception e) {
            throw new RuntimeException("日期转换异常");
        }
    }
}
