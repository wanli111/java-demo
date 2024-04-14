package com.wanli.demo;

import java.util.Scanner;

/**
 * @author 万里@date 2024-01-16 13:28@version 1.0目前正在开发中...
 */
public class Demo03 {
    /**
     * 键盘录入数据scanner
     * 需要通过scnaner类new一个对象出来使用
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 新建一个引用数据类型的变量叫scanner
         * 没有对象，通过scanner类new一个scanner对象出来作为变量值
         */
        System.out.println("打印字符串:");//打印任意字符串，但必须在开头定义
        Scanner scanner = new Scanner(System.in);
        String nextline = scanner.nextLine();
        System.out.println(nextline);
        System.out.println("打印一个整数：");
        int nextint = scanner.nextInt();
        System.out.println(nextint);
        System.out.println("打印字符串:");//打印不带空格的字符串
        String next = scanner.next();
        System.out.println(next);
        System.out.println("打印浮点形:");
        double nextdouble= scanner.nextDouble();
        System.out.println(nextdouble);
    }
}
