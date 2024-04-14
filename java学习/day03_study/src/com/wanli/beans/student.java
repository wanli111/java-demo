package com.wanli.beans;

/**
 * @author 万里@date 2024-01-16 18:34@version 1.0目前正在开发中...
 */
public class student {
    public student(){

    }
    public student(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    private String name;
    private int age;
    private String address;
    public void Study(){
        System.out.println(name+"正在学习");
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void eat(Food Food){
        System.out.println(name+age+"岁了,正在eating"+Food.getFood());
    }
}
