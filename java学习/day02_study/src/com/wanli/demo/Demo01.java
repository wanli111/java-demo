package com.wanli.demo;

/**
 * @author 万里@date 2024-01-16 12:36@version 1.0目前正在开发中...
 */


public class Demo01 {
    /**
     * if循环判断登录状态
     * @param args
     */
    public static void main(String[] args) {
        String result = toLogin("wanli320","1q2w3e4r");
        System.out.println("登录状态"+result);
    }
    public static String toLogin(String a,String b){
        //传入两个形参 用if循环来测试是否登录成功发
        if (a.equals("wanli320") && b.equals("1q2w3e4r")){
            return "登录成功";
        }
        return "登录失败";
    }
}
