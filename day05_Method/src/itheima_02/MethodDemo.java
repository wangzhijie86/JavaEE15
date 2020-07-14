package itheima_02;
/*
    带参数方法的定义和调用

    定义格式：
        public static void 方法名(参数) { … … }

	调用格式：
        方法名(参数);
 */
public class MethodDemo {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(99);
        //变量的调用
       int number = 10;
       isEvenNumber(number);
    }

    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
   public static void isEvenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }
    }
    //本次调用两次方法
    //行参可以和实参不同名，但是形参必须和局部变量同名，局部变量才能接收参数。
}
