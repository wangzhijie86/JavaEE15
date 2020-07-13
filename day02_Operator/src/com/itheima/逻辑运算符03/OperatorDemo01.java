package com.itheima.逻辑运算符03;

public class OperatorDemo01 {
    public static void main(String[] args) {
        /*
        逻辑运算符
         */
        //定义变量
        int i = 100;
        int j = 200;
        int k = 300;

        //& 有false则false    表达式左右两边都成立才为true，有一处不成立九尾false
        System.out.println(i < j & j > k);//true & false
        System.out.println(i < j & j < k);//true & true
        System.out.println(i > j & j > k);//false & false
        System.out.println(i > j & j < k);//false & true
        System.out.println("----------------");
        //| 有true则true
        System.out.println(i < j | j > k);//true & false
        System.out.println(i < j | j < k);//true & true
        System.out.println(i > j | j > k);//false & false
        System.out.println(i > j | j < k);//false & true
        System.out.println("----------------");
        //^ 相同为false，不同为true
        System.out.println(i < j ^ j > k);//true & false
        System.out.println(i < j ^ j < k);//true & true
        System.out.println(i > j ^ j > k);//false & false
        System.out.println(i > j ^ j < k);//false & true
        System.out.println("----------------");
        //!
        System.out.println(!(i < j ^ j > k));//true & false
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false
        System.out.println(!!(i > j)); //!!false
        System.out.println(!!!(i > j)); //!!!false
        System.out.println("----------------");
    }
}
