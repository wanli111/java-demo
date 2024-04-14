package com.wanli.demo.test;

/**
 * @author 万里@date 2024-01-17 18:23@version 1.0目前正在开发中...
 */
public class people {
    //员工 姓名 年龄 薪水 住址 爱好
    String[][] strings = new String[5][];
    private String name;
    private int age;
    private double salary;
    private String address;
    private String hobby;
    //无参构造
    public people(){

    }
    //有参构造
    public people(String name,int age,double salary,String address,String hobby){
        if (age < 0){
            System.out.println("您设置的年龄不合法");
            return;//结束当前方法
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.hobby = hobby;
    }



    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
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
        if (age < 0){
            System.out.println("您设置的年龄不合法");
            return;//结束当前方法
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

