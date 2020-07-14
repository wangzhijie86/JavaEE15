package itheima_03;

public class MethodDeno01 {
    public static void main(String[] args) {
        //1.使用常量传参
        isEvenNumber(10);
        System.out.println("*****************");
        if(isEvenNumber(11)) {
            System.out.println("返回值是偶数" + "\t" + "测试方法能否作为if条件");
        } else {
            System.out.println("返回值是奇数" + "\t" + "测试方法能否作为if条件");
        }

        //2.使用变量接收
        //数据类型 变量名 = 方法名(参数);
        System.out.println("-------------------");
        boolean flag = isEvenNumber(10);
        //boolean flag = true;
        System.out.println(flag);
    }

    public static boolean isEvenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("是偶数");
            return true;
        } else {
            System.out.println("是奇数");
            return false;
        }
    }
}
