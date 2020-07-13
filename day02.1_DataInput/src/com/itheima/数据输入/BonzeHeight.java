package com.itheima.数据输入;

import java.util.Scanner;
public class BonzeHeight {
    public static void main(String[] args) {

        /*
        三个和尚

	需求：
		一座寺庙里住着三个和尚，他们的身高必须经过测量得出，请用程序实现获取这三个和尚的最高身高。
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3个整数身高，作为三位和尚的身高。");
        int bonzeHeight1 = sc.nextInt();
        int bonzeHeight2 = sc.nextInt();
        int bonzeHeight3 = sc.nextInt();
        System.out.println(("bonzeHeight1 : " + bonzeHeight1) + "\n" + ("bonzeHeight2 : " + bonzeHeight2) + "\n"  + ("bonzeHeight3 : " + bonzeHeight3));
        int tempBonzeHeight1 = bonzeHeight1 > bonzeHeight2 ? bonzeHeight1 : bonzeHeight2;
        int max = tempBonzeHeight1 > bonzeHeight3 ? tempBonzeHeight1 : bonzeHeight3;
        System.out.println(max);
        sc.close();
    }
}
