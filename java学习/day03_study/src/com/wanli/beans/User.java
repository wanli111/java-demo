package com.wanli.beans;

/**
 * @author 万里@date 2024-01-16 20:12@version 1.0目前正在开发中...
 */
public class User {
    private String userName;
    private int age;
    private char sgender;
    private String idcard;
    private String phone;

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public char getSgender() {
        return sgender;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSgender(char sgender) {
        this.sgender = sgender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", sgender=" + sgender +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
