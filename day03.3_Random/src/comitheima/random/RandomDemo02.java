package comitheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo02 {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(99) + 1;

        while(true) {
            System.out.println("请输入要猜的数字");
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("您猜的数字大了");
            } else if(guessNumber < number) {
                System.out.println("您猜的数字小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
