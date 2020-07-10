package com.itheima;

public class ConversionDemo05 {
    public static void main(String[] args) {

        /**类型转换
         *
         */

        //自动类型转换
        double d = 100000;
        System.out.println(d);

        //定义byte类型的变量
        byte b = 100;
        short s = b;
        int i = b;

        //char c = b;

        //byte是不能转换为char的，不兼容

        //强制类型转换
        int in = (int) 666.6;
        System.out.println(in);
    }
}
