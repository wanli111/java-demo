package com.wanli.demo;

import java.util.Scanner;

/**
 * @author 万里@date 2024-01-17 13:52@version 1.0目前正在开发中...
 */
public class demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要求1加到几的阶乘之和:");
        int number = scanner.nextInt();
        int result = factorial(number);
        int sum = 0;
        for (int i=1;i<=number;i++){
            sum += factorial(i);
        }
        System.out.print("1加到"+number+"的阶乘和为:");
        System.out.println(sum);
    }
    public static int factorial(int num){
        if (num <= 1){
            return 1;
        }
        else {
            return num*factorial(num - 1);
        }
    }
}
