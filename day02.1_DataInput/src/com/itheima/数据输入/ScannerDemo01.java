package com.itheima.数据输入;
import java.util.Scanner;
public class ScannerDemo01 {
    public static void main(String[] args) {
        //创建输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请使用键盘输入数据");
        String s = sc.next();
        int i = sc.nextInt();
        System.out.println(s + i);
    }
}
