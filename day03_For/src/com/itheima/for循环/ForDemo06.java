package com.itheima.for循环;

public class ForDemo06 {
    public static void main(String[] args) {

        //计数器
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i /100 % 10;

            /*
            int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
             */
            if (ge * ge *ge + shi * shi * shi + bai * bai * bai == i) {
                count++;

            }
        }
        System.out.println(count);
    }
}
