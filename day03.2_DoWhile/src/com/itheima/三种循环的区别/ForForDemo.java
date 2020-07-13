package com.itheima.三种循环的区别;
/*
	三种循环的区别
 */
public class ForForDemo {
    public static void main(String[] args) {
		/*
		//for循环
		for(int i = 3; i<3; i++) {
			System.out.println("我爱Java");
		}
		System.out.println("--------");

		//while循环
		int j = 3;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println("--------");

		//do...while循环
		int k = 3;
		do {
			System.out.println("我爱Java");
			k++;
		}while(k<3);
		*/

		/*

		//for循环     while循环会先执行后判断
		for(int i = 1; i<3; i++) {
			System.out.println("我爱Java");
		}
		//System.out.println(i);
		System.out.println("--------");

		//while循环      i和j的作用域不同，i作用域在for循环内，j贯穿循环内外
		int j = 1;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println(j);
		System.out.println("--------");
		*/

        //死循环
		/*
		for(;;) {
			System.out.println("for");
		}
		*/

		/*
		while(true) {
			System.out.println("while");
		}
		*/

        do {
            System.out.println("do...while");
        }while(true);
    }
}
