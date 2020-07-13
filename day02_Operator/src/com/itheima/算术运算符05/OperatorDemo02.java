package com.itheima.算术运算符05;

public class OperatorDemo02 {
    public static void main(String[] args) {
        /*
	字符的"+"操作
    */

        //定义两个变量
        int i = 100;
        char c = 'A';    //'A'的值是65
        System.out.println(c + 1);//输出是66
        c = 'a';//'a'的值是97
        c = 'o';//'o'的值是111
        c = '0';
        System.out.println(i + c);

        //char ch = i + c;
        //char类型会被自动提升为int类型
        int j = i + c;
        System.out.println(j);

        //int k = 10 + 13.14;
        double d = 10 + 13.14;
    }
}
