package com.itheima;

public class VariableDemo01 {
    public static void main(String[] args) {

        /**
        变量定义格式：
		    数据类型 变量名 = 变量值;

	    基本数据类型：
		    byte,short,int,long,float,double,char,boolean

	    变量的使用：
		    取值格式：变量名

		    修改值格式：变量名 = 变量值;
        */

        //定义变量
        int a = 10;

        //输出变量
        System.out.println("初始化时的值" + a);

        //修改变量
        a = 20;
        System.out.println("修改后的值" + a);
    }
}
