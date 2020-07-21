package com.dm.insurance.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class ResultUtil {

    private Integer code;
    private String message;
    private Map<String, Object> extended = new HashMap<>();

    //防止被外部实例化
    private ResultUtil(){}
    private ResultUtil(ResultSet resultSet){
        this.code = resultSet.getCode();
        this.message = resultSet.getMessage();
    };

    public static ResultUtil success(){
        ResultUtil result = new ResultUtil(ResultSet.SUCCESS);
        return result;
    }

    public static ResultUtil failure(){
        ResultUtil result = new ResultUtil(ResultSet.FAIL);
        return result;
    }

    public ResultUtil addObject(String key, Object value){
        this.extended.put(key, value);
        return this;
    }

}
