package com.wanli.demo;

import com.wanli.beans.User;
import com.wanli.beans.student;

/**
 * @author 万里@date 2024-01-16 21:01@version 1.0目前正在开发中...
 */
public class demo02 {
    public static void main(String[] args) {
        //有参构造函数使用
        student student = new student("周子彦",18,"泰州");
        User user = new User();
        System.out.println(student.getAddress()+":"+"("+student.getName()+":"+student.getAge()+")");
        System.out.println(user.toString());
    }
}
