package itheima_05;

/*
    方法重载：
        多个方法在同一个类中
        多个方法具有相同的方法名
        多个方法的参数不相同，类型不同或者数量不同

        与返回值无关
        在调用的时候，Java虚拟机会通过参数的不同来区分同名的方法
 */
public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
       int sum1 = sum(10,220);
        System.out.println(sum1);
       double sum2 = sum(13.5,15.6);
        System.out.println(sum2);
        String sum3 = sum("1","2","c");
        System.out.println(sum3);

    }

    //需求1：求两个int类型数据和的方法
   public static int sum(int a,int b) {
        return a + b;
   }

    //需求2：求两个double类型数据和的方法
   public static double sum(double a, double b) {
        return a + b;
   }

    //需求3：求三个int类型数据和的方法
   public static String sum(String a, String b,String c){
        return a + b + c;
   }
}
