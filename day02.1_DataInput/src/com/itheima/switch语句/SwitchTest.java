package com.itheima.switch语句;

import java.util.Scanner;
public class SwitchTest {
    public static void main(String[] args) {
        /*
        春夏秋冬

	需求：
		一年有12个月，分属于春夏秋冬4个季节，键盘录入一个月份，请用程序实现判断该月份属于哪个季节，并输出。

	春：3、4、5
	夏：6、7、8
	秋：9、10、11
	冬：1、2、12
         */
        System.out.println("开始输入");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        /*switch(month) {
            case 1:
                System.out.println("冬");
                break;
            case 2:
                System.out.println("冬");
                break;
            case 3:
                System.out.println("春");
                break;
            case 4:
                System.out.println("春");
                break;
            case 5:
                System.out.println("春");
                break;
            case 6:
                System.out.println("夏");
                break;
            case 7:
                System.out.println("夏");
                break;
            case 8:
                System.out.println("夏");
                break;
            case 9:
                System.out.println("秋");
                break;
            case 10:
                System.out.println("秋");
                break;
            case 11:
                System.out.println("秋");
                break;
            case 12:
                System.out.println("冬");
                break;
            default :
                System.out.println("您输入的有误");
                break;
        }*/

        //case穿透
        switch(month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            default : {
                System.out.println("您输入的有误");
                break;
            }
        }
    sc.close();
    }
}
