package com.by.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2019-12-12 21:33:12
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = 129710035206021043L;
    
    private Integer userId;
    
    private String userName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userBir;
    
    private String userAge;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserBir() {
        return userBir;
    }

    public void setUserBir(Date userBir) {
        this.userBir = userBir;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

}