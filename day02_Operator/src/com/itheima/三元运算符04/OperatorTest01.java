package com.itheima.三元运算符04;

public class OperatorTest01 {
    public static void main(String[] args) {
        /*
        两只老虎

	需求：
		动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
		请用程序实现判断两只老虎的体重是否相同。
         */
        int tigerWeight1 = 180;
        int tigerWeight2 = 200;

        int i = tigerWeight1 == tigerWeight2 ? tigerWeight1 : tigerWeight2;
        System.out.println(i);

        char c =  tigerWeight1 == tigerWeight2 ? '一' : '二';
        System.out.println(c);

        String s = tigerWeight1 == tigerWeight2 ? "tigerWeight1" : "tigerWeight2";
        System.out.println(s);
    }
}
