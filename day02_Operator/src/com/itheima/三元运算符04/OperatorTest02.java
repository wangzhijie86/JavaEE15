package com.itheima.三元运算符04;

public class OperatorTest02 {
    public static void main(String[] args) {
        /*
        三个和尚

	需求：
		一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
		请用程序实现获取这三个和尚的最高身高。
         */
        int bonzeHeight1 = 150;
        int bonzeHeight2 = 210;
        int bonzeHeight3 = 165;

        int bonzeTempHeight = bonzeHeight1 >bonzeHeight2 ? bonzeHeight1 : bonzeHeight2;
        int max = bonzeTempHeight > bonzeHeight3 ? bonzeTempHeight : bonzeHeight3;
        String max1 = bonzeTempHeight > bonzeHeight3 ? "bonzeTempHeight" : "bonzeHeight3";
        System.out.println("最高的和尚是 ：" + max1 + " : " + max);
    }
}
