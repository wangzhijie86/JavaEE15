package com.itheima;

public class VariableDemo02 {
    public static void main(String[] args) {
        /**
        变量使用的注意事项：
            名字不能重复
            变量未赋值，不能使用
            long类型的变量定义的时候，为了防止整数过大，后面要加L
            float类型的变量定义的时候，为了防止类型不兼容，后面要加F

        */

        //定义byte类型的变量
        byte b = 10;
        System.out.println(b);
        //定义short类型的变量
        short s = 2000;
        System.out.println(s);
        //定义int类型的变量
        int i = 888888888;
        System.out.println(i);
        //定义double类型的变量
        double d = 999999999;
        System.out.println(d);
        double dd = 999999999.9;
        System.out.println(dd);
        //定义char类型的变量
        char c = 'a';
        System.out.println(c);
        //定义boolean类型的变量
        //boolean b = true;
        //System.out.println(b);
        boolean bb = true;
        System.out.println(bb);
        //定义long类型的变量
        long l = 666666666666666666L;
        System.out.println(l);
        //定义float类型的变量
        float f = 3.1415936F;
        System.out.println(f);

    }

}
