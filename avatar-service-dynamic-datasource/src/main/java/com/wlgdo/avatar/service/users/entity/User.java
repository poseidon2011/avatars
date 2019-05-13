package com.wlgdo.avatar.service.users.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private String password;

    private String accountNo;

    private Date updateTime;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}