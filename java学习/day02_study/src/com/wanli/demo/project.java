package com.wanli.demo;

import java.util.Scanner;

/**
 * @author 万里@date 2024-01-16 13:59@version 1.0目前正在开发中...
 */
public class project {
    public static void main(String[] args) {
        //创建控制台输出打印对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = scanner.next();
        System.out.println("请输入密码:");
        String password = scanner.next();
        String result = toLogin(username,password);
        System.out.println(result);
    }
    public static String toLogin(String username,String password){
        //判断字符串是否相等用.equals调用
        if (username.equals("zs001") && password.equals("123456")){
            return "登录成功";
        }
        else {
            return "账号或密码错误！！登陆失败";
        }
    }
}
