package com.itheima.赋值运算01;

public class OperatorDemo {
    public static void main(String[] args) {
        //把100赋值给int类型的变量i
        int i = 100;
        System.out.println("i : " + i);

        //扩展运算符+=   -=  *=  /=  %=
        // += 把左边和右边的数据做加法操作，结果赋值给左边
        i += 10;
        //i = i + 20;
        System.out.println("i : " + i);

        //注意：扩展的赋值运算符底层隐含了强制类型转换
        short s = 10;
        s += 10;
       // s = s + 20;需要类型转换，因为20时int类型，所以short和int相加，会自动转型成int类型，所以需要强制类型转换
       // s = (short)(s + 20);对上一步的强制类型转换
        System.out.println("s : " + s);
        byte maxValue = Byte.MAX_VALUE;
        System.out.println(maxValue);
    }
}
