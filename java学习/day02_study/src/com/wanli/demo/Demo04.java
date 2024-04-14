package com.wanli.demo;

/**
 * @author 万里@date 2024-01-16 14:22@version 1.0目前正在开发中...
 */
public class Demo04 {
    /**
     * 数组
     * 数组是一种数据结构，是用于存储数据的容器
     * 数组是一种引用数据类型
     * 数组可以通过下标索引存值取值，索引从零开始
     * 数组定义以及初始化的方式
     * 数组定义的两种方式
     * ----数据类型[] 数组名 = new 数组长度 String[] strings = new String[4]
     * -----数据类型[] 数组名 = {内容} Sting strings = {"hello","world","java"}
     * 取出数组中的值
     * ----for循环便利
     * -----foreach 加强版的for循环
     *方法区 存放常量池的常量 存储代码片段 存储当前类的字节码对象
     * 所有new出来的内存将会划分在堆中，堆存放全局变量
     * 栈存放局部变量
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = new int[4];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        for (int i = 0; i < ints.length; i++) {
            System.out.println("第" + (i + 1) + "个元素是:" + ints[i]);
        }
        String[] strings = {"hello","world","java","python"};
        for(String i : strings){
            //foreach 加强版的for循环 数据类型 变量存放数据 : 数组名
            System.out.println(i);
        }
    }
}
