package com.itheima.逻辑运算符03;

public class TestLogic {
    public static void main(String[] args) {
        boolean b = true;
        boolean c = false;
        boolean d = true;

        //与运算，参与运算是值只要有一个为假结果就为假，同时为真，结果才为真
        System.out.println(b&c);
        System.out.println((b & d) + "*");

        //或运算，参与运算的值，只要有一个为真，结果就为真，同时为假，结果才是假
        System.out.println(b|c);

        //取反
        System.out.println(!b);

        //异或，参与运算的值相同，结果为假，参与运算的值不同，结果为真
        System.out.println(b^c);

        //简洁与，先判断c的值，如果为假，直接把结果置为假，不会再判断b的值，但是如果c					的值是真，那么依然要判断b的值
        System.out.println(c&&b);

        //简洁或，先判断c的值，如果是真，那么直接把结果置为真，不会再判断b的值，如果c					是假，那么依然要判断b的值。
        System.out.println(c||b);
    }
}
