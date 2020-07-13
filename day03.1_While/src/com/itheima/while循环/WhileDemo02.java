package com.itheima.while循环;

public class WhileDemo02 {
    public static void main(String[] args) {
        /*
        珠穆朗玛峰

	需求：
		世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
		请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
         */

        //定义一个计数器，初始值为0
        int count = 0;

        //定义纸张厚度
        double pattern = 0.1;

        //定义珠穆朗玛峰的高度
       double mountEverest = 8844430;

        //因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
        //折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
        while(pattern <= mountEverest) {


            //循环的执行过程中每次纸张折叠，纸张的厚度要加倍
            pattern *= 2;

            //在循环中执行累加，对应折叠了多少次
            count++;
            System.out.println("折叠第" + count + "次" + "\t" + "纸张厚度是 : " + pattern);
            System.out.println("******************************************");
        }

        //打印计数器的值
        System.out.println("需要折叠 ：" + count + "次");





    }
}
