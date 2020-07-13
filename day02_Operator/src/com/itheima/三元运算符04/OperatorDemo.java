package com.itheima.三元运算符04;

public class OperatorDemo {
    public static void main(String[] args) {
        /*
        三元运算符

	格式：
		关系表达式 ? 表达式1 : 表达式2;

	范例：
		a > b ? a : b;

	执行流程：
		首先计算关系表达式的值
		如果值为true，表达式1的值就是运算结果
		如果值为false，表达式2的值就是运算结果
         */

        //定义变量
        int i = 100;
        int j = 200;

        //获取两个数据中的较大值
        int max = i > j ? i : j;
        System.out.println(max);
    }
}
