package com.dm.insurance.pojo;

import lombok.Data;

@Data
public class Users {

    private String name;
    private String sex;
    private Integer age;

    public Users() {
    }

    public Users(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
