package com.wanli.demo;

import java.util.Scanner;

/**
 * @author 万里@date 2024-01-16 16:53@version 1.0目前正在开发中...
 */
public class project02 {
    public static void main(String[] args) {
        /**
         * 通过数组记录10个员工的工资
         * 对每个员工的工资进行打印
         * 求出最高工资和平均薪水
         */
        String[] names = new String[10];
        double[] sale = new double[10];
        Scanner scaner = new Scanner(System.in);
        for (int i = 0;i < names.length;i++){
            System.out.println("请输入员工姓名:");
            String next = scaner.next();
            System.out.println("请输入员工工资:");
           double doubles = scaner.nextDouble();
            names[i] = next;
            sale[i] = doubles;
        }
        for (int j =0;j < 10; j++){
            System.out.println(names[j]+"的工资:"+sale[j]);
        }
        int max_sala = max_sala(sale);
        System.out.println("最大薪资是:"+max_sala);
        int avag_sala = avag_sala(sale);
        System.out.println("平均值:"+avag_sala);
    }
    public static int max_sala(double[] sale){
        double t = 0;
        for (int i = 0; i < 10; i++){
            if(sale[i] > sale[i+1] ){
                sale[i] = t;
                t = sale[i+1];
                sale[i+1] = sale[i];
            }
        }
        return (int) sale[9];
    }
    public static int avag_sala(double[] sale){
        return 0;
    }
}
