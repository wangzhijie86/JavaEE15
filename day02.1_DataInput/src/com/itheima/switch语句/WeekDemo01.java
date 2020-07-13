package com.itheima.switch语句;

import java.util.Scanner;
public class WeekDemo01 {
    public static void main(String[] args) {
        System.out.println("开始输入");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch(week) {
            case 1:
                System.out.println("星期一");
                break;

            case 2:
                System.out.println("您输入的是星期二");
                break;
            case 3:
                System.out.println("您输入的是星期三");
                break;
            case 4:
                System.out.println("您输入的是星期四");
                break;
            case 5:
                 System.out.println("您输入的是星期五");
                 break;
            case 6:
                System.out.println("您输入的是星期六");
                break;
            case 7:
                System.out.println("您输入的是星期日");
                break;
            default :
                System.out.println("您输入的不在1~7范围");
                break;
        }
        sc.close();
    }
}
