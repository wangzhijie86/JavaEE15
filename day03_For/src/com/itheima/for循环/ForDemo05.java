package com.itheima.for循环;

public class ForDemo05 {
    public static void main(String[] args) {
        /*
        需求：在控制台输出所有的“水仙花数”

        案例：水仙花
            什么是“水仙花数”？
            ① 水仙花数是一个三位数
                111    222    333    370    371    520    999
            ② 水仙花数的个位、十位、百位的数字立方和等于原数
                123 13+23+33 =   1 +   8   + 27 =   36 ≠  123 不是水仙花数
                371 33+73+13 = 27 + 343 +  1 =  371 ＝ 371    是水仙花数
         */


        for (int i = 100; i < 1000; i++) {
        //在计算之前获取三位数中每个位上的值
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            //判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                //输出满足条件的数字就是水仙花数
                System.out.println(i);
            }
        }
    }
}
