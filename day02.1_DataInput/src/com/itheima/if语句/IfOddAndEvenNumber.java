package com.itheima.if语句;

import java.util.Scanner;
public class IfOddAndEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数，判断是奇数还是偶数。");
        int number;
        if((number = sc.nextInt()) % 2 == 0) {
            System.out.println("输入的是偶数");
        }else {
            System.out.println("输入的是奇数");
        }
        sc.close();
    }
}
