package com.wanli.demo;

import java.util.Scanner;

/**
 * @author 万里@date 2024-01-16 14:14@version 1.0目前正在开发中...
 */
public class project01 {
    /**
     * 键盘录入两个数据，并求和
     * 键盘录入两个数据，并求最大值
     * 键盘录入三个数据求最大值
     * 键盘录入两个数据判断是否相等
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数：");
        int num3 = scanner.nextInt();
        System.out.println("sum = "+(num1+num2));
        System.out.println("maxnum = "+maxNum(num1,num2));
        System.out.println("maxnum = "+maxNum(num1,num2,num3));
        System.out.println("是否相等:"+equals(num1,num2));
    }
    public static int maxNum(int num1,int num2){
        if (num1 > num2){
            return num1;
        }
        return num2;
    }
    public static int maxNum(int num1,int num2,int num3){
        if (num1 > num2){
            if (num1 > num3){
                return num1;
            }
            return num2;
        }
        else if (num2 > num3){
            return num2;
        }
        return num3;
    }
    public static boolean equals(int num1,int num2){
        return num1 == num2;
    }
}
