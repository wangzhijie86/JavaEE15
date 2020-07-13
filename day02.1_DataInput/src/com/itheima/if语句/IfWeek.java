package com.itheima.if语句;

import java.util.Scanner;
public class IfWeek {
    public static void main(String[] args) {

        System.out.println("输入开始");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        if(week == 1) {
            System.out.println("您输入的是星期一");
        } else if(week == 2) {
            System.out.println("您输入的是星期二");
        } else if(week == 3) {
            System.out.println("您输入的是星期三");
        } else if(week == 4) {
            System.out.println("您输入的是星期四");
        } else if(week == 5) {
            System.out.println("您输入的是星期五");
        } else if(week == 6) {
            System.out.println("您输入的是星期六");
        } else if(week == 7) {
            System.out.println("您输入的是星期日");
        } else {
            System.out.println("您输入的不在1~7范围");
        }
        sc.close();
    }
}
