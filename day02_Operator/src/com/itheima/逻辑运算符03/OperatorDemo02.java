package com.itheima.逻辑运算符03;

public class OperatorDemo02 {
    public static void main(String[] args) {
        /*
        短路逻辑运算符
         */

        //定义变量
        int i = 100;
        int j = 200;
        int k = 300;

        //&& 有false则false
        System.out.println(i < j && j > k);//true & false
        System.out.println(i < j && j < k);//true & true
        System.out.println(i > j && j > k);//false & false
        System.out.println(i > j && j < k);//false & true
        System.out.println("----------------");
        //|| 有true则true
        System.out.println(i < j || j > k);//true & false
        System.out.println(i < j || j < k);//true & true
        System.out.println(i > j || j > k);//false & false
        System.out.println(i > j || j < k);//false & true
        System.out.println("----------------");

        //&&和&
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        //System.out.println((i++ > 100) & (j++ > 100)); //false & true    先比较后运算
        //System.out.println((++i > 100) & (++j > 100)); //true & true    先运算后比较

        System.out.println((i++ > 100) && (j++ > 100)); //false && true     从左到右执行，左边为真，右边执行，左边为假，右边不执行
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
