package com.itheima.if语句;

import java.util.Scanner;
public class IfDemo03 {
    public static void main(String[] args) {
        /*
        考试奖励

	需求：
		小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，假如你可以控制小明的得分，
		请用程序实现小明到底该获得什么样的礼物，并在控制台输出。

	奖励：
		95~100		山地自行车一辆
		90~94		游乐场玩一次
		80~89		变形金刚玩具一个
		80以下		胖揍一顿

         */
        System.out.println("开始输入分数");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        /*if(score > 95 && score <= 100) {
            System.out.println("奖励山地自行车一辆");
        } else if(score >90 && score <=94) {
            System.out.println("奖励游乐场玩一次");
        }else if(score >80 && score <= 89) {
            System.out.println("奖励变形金刚玩具一个");
        } else {
            System.out.println("胖揍一顿");
        }*/

        //数据测试：正确数据，边界数据，错误数据
        if (score > 100 || score < 0) {
            System.out.println("您输入的分数有误");
        } else if(score > 95 && score <= 100) {
            System.out.println("奖励山地自行车一辆");
        } else if(score >90 && score <=94) {
            System.out.println("奖励游乐场玩一次");
        } else if(score >80 && score <= 89) {
            System.out.println("奖励变形金刚玩具一个");
        } else {
            System.out.println("胖揍一顿");
        }
    }
}
