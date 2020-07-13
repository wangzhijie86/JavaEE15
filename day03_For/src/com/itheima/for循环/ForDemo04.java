package com.itheima.for循环;

public class ForDemo04 {
    public static void main(String[] args) {
        /*
        求偶数和

	需求：
		求1-100之间的偶数和，并把求和结果在控制台输出
         */
        int evenNumber = 0;
        for (int i = 1; i <101 ; i++) {
            System.out.println("第" + i+ "次循环");
            //System.out.println("****************");
            if(i % 2 == 0) {
                System.out.println("i : " + i);
                System.out.println(evenNumber += i);
                System.out.println("------------");
            } else {
                System.out.println("第" + i+ "次循环是奇数" + "\n" + "******************");
            }
        }









    }
}
