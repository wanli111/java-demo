package com.wanli.demo;

import com.wanli.beans.Food;
import com.wanli.beans.User;
import com.wanli.beans.student;

/**
 * @author 万里@date 2024-01-16 17:29@version 1.0目前正在开发中...
 */
public class demo01 {
    public static void main(String[] args) {
        student student = new student();
        //无参构造函数的使用
        student.setName("张三");
        student.setAge(18);
        student.setAddress("镇江");
        student.Study();
        Food food = new Food();
        student.eat(food);
        System.out.println(student.getAddress());
        User user = new User();
        user.setUserName("李四");
        user.setAge(18);
        user.setSgender('男');
        System.out.println(user.getUserName()+" 年龄:"+user.getAge()+"性别:"+user.getSgender());
    }
}
