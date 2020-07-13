package com.itheima.自增自减运算符06;

public class OperatorDemo {
    public static void main(String[] args) {
        /*
        *自增自减运算符
        *  */

        //定义整形变量
        int i = 100;
        System.out.println(i);

        //单独使用时,
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        //单独使用时，及如果都是一样的。

        //参与操作使用
        int j = i++;//代码从左到右执行，先把i赋值给j，然后i做++；所以j和i的值不同，
        System.out.println(j);
        j = ++i;//代码从左到右执行，先i做++，然后赋值给j
        System.out.println(j);
    }
}
