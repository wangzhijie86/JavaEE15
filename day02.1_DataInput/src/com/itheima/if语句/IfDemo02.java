package com.itheima.if语句;

import java.util.Scanner;
public class IfDemo02 {
    public static void main(String[] args) {
        /*
        if语句格式2

	格式：
		if (关系表达式) {
			语句体1;
		} else {
			语句体2;
		}

	执行流程：
		1:首先计算关系表达式的值
		2:如果关系表达式的值为true就执行语句体1
		3:如果关系表达式的值为false就执行语句体2
		4:继续执行后面的语句内容
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");

        int a;
        int b;
        if((a = sc.nextInt()) > (b = sc.nextInt())) {
            System.out.println("a>b");
        }else {
            System.out.println("a<b");
        }
        sc.close();
    }
}
