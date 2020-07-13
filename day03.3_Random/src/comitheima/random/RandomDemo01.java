package comitheima.random;

import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("number : " + number);

        //用循环获取10个随机数
        System.out.println("-------------------");
        for (int i = 0; i < 11; i++) {
            int number1 = random.nextInt(10);
            System.out.println(number1);
        }

        //需求：获取一个1-100之间的随机数
        System.out.println("-----------------------");
        int number2 = random.nextInt(100) + 1;
        System.out.println(number2);
    }
}
