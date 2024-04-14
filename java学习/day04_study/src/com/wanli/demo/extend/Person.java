package com.wanli.demo.extend;

/**
 * @author 万里@date 2024-01-17 18:17@version 1.0目前正在开发中...
 */
public class Person {
    private String name;
    private int age;
    private String address;
    private String sgender;

    public Person(String name, int age, String address, String sgender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sgender = sgender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }
}
