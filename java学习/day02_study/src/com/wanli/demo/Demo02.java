package com.wanli.demo;

/**
 * @author 万里@date 2024-01-16 12:43@version 1.0目前正在开发中...
 */
public class Demo02 {
    /**
     * 比较整数字符串是否相等
     * 求两个整数的最大值
     * 求三个整数的最大值
     * @param args
     */
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 200;
        int d = 300;
        System.out.println(getMaxNum(a,b,d));
        System.out.println(getMaxNum(a,b));
        System.out.println(getEquals(b,c));
    }
    public static int getMaxNum(int a,int b){
        if (a > b){
            return a;
        }
        return b;
    }
    public static int getMaxNum(int a,int b,int c){
        if (a > b){
            if (a > c){
                return a;
            }
            return c;
        }
        else if (b > c){
            return b;
        }
        return c;
    }
    public static boolean getEquals(int a,int b){
        return a==b;
    }
}
