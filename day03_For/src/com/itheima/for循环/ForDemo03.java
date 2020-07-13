package com.itheima.for循环;

public class ForDemo03 {
    public static void main(String[] args) {
        //需求：求1-5之间的数据和，并把求和结果在控制台输出
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("第" + i+ "次循环\t" + "i : " + i + "\t" + "sum : " + sum);
            sum += i;
            System.out.println(sum);
            System.out.println("---------------------------");
        }

        /*
				sum += i;	sum = sum + i;
				第一次：sum = sum + i = 0 + 1 = 1;
				第二次：sum = sum + i = 1 + 2 = 3;
				第三次：sum = sum + i = 3 + 3 = 6;
				第四次：sum = sum + i = 6 + 4 = 10;
				第五次：sum = sum + i = 10 + 5 = 15;
		*/
    }
}
