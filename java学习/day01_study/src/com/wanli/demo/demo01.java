package com.wanli.demo;

/**
 * @author 万里@date 2024-01-15 22:10@version 1.0目前正在开发中...
 */

/**
 * java "爪哇" 咖啡 james gosling "java之父"
 * JDK java开发包工具 包含javac编译器 java运行器 JVMjava虚拟机 JRE java运行环境
 * JRE 用于运行java的环境
 * JVM 用于和操作系统进行交互，可以实现java跨平台性 java虚拟机
 * 一个java程序运行过程：
 *      1.编写java源码 test.java
 *      2.编译源码 用javac.exe进行编译成字节码文件test.class
 *      3.用java.exe程序运行
 * jdk里面包含JRE和JVM和一些java运行开发包工具程序等
 */
public class demo01 {
    public static void main(String[] args) {
        //这是我的第一个java代码 hello rld
        System.out.println("hello world");
        System.out.println("---------------");
        int a = 3;
        float f = 12.5f; //浮点型 8字节
        double c = 13.2; //默认小数类型 4字节
        byte b = 127; // -128~127 1字节
        short s = 1000; //2字节
        int i1 = 100; //4字节
        long l1 = 2000000; //8字节
        System.out.println(a+(int)b);
        System.out.println(f+a);
        char c1 = 'c'; //字符型 有且只有一个值
        String s1 = "hello"; //字符型常量（字面值）
        String s2 = "world"; //String使用大驼峰式定义法定义的一个类的标识符
        System.out.println(s1+" "+s2); //+号如果是整形会运算 如果是字符型是拼接
        int i =3; //-2^32-2^32-1
        System.out.println("-------------------");
        System.out.println(i++); //3
        System.out.println(++i); //5
        System.out.println(--i); //4
        System.out.println(i--); //4
        System.out.println(i); //3
    }
}
/**
 * 标识符：给类接口变量起名时候用到的字符序列
 * 遵循驼峰式规范：类之类的比如String Class等都是大驼峰式 小驼峰式用于定义变量
 * 变量：字符类型，整形变量
 * 全局变量(成员变量):定义在类内部，方法外面
 * 局部变量: 定义在方法里面
 * JVM包含栈（局部变量），堆（全局变量），方法区
 */
/**
 * ++i --i先运算后取值
 * i++ i--先取值后运算
 */