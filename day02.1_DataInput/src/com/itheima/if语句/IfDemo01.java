package com.itheima.if语句;

import java.util.Scanner;
public class IfDemo01 {
    public static void main(String[] args) {
        /*
        if语句格式1

	格式：
		if (关系表达式) {
			语句体;
		}

	执行流程：
		1:首先计算关系表达式的值
		2:如果关系表达式的值为true就执行语句体
		3:如果关系表达式的值为false就不执行语句体
		4:继续执行后面的语句内容
         */
        System.out.println("开始,请输入两位整数。");
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        if((a = sc.nextInt()) > (b = sc.nextInt())) {//数据类型只能放到外面定义，在if条件里赋值
            System.out.println("a大于b");
        }
        System.out.println("请输入两位整数。");
        if((c = sc.nextInt()) == (d = sc.nextInt())) {
            System.out.println("c等于d");
        }
        System.out.println("请输入四位整数。");
        if((a = sc.nextInt()) > (b = sc.nextInt()) & (c = sc.nextInt()) == (d = sc.nextInt())) {
            System.out.println("a大于b并且c等于d");
        }
        sc.close();
        System.out.println("结束");
    }
}
