package com.itheima.关系运算符02;

public class OperatorDemo {
    public static void main(String[] args) {
        /*
        关系运算符
         */

        //定义变量
        int i = 100;
        int j = 200;
        int k = 300;

        //  ==
        boolean b = i == j;
        System.out.println("i == j : " + b);
        //  !=
        System.out.println("j != k : " + (j != k));//没有变量直接接收值时，需要给把逻辑体括号括起。
        //  <
        System.out.println("i < j : " + (i < j));
        //  >
        System.out.println("j > k : " + (j > k));
        //  <==
        System.out.println("j <= k : " + (j <= k));
        //  >==
        System.out.println("k >= i : " + (k >= i));

        //不小心把==写成了=
        //把j的值赋值给了i，然后输出i的值
        System.out.println(i = j);
    }
}
