# 2  For循环

## 	1.0 for循环

```java
1.1 循环结构 

	循环结构的组成： 
			初始化语句： 用于表示循环开启时的起始状态，简单说就是循环开始的时候什么样 
			条件判断语句：用于表示循环反复执行的条件，简单说就是判断循环是否能一直执行下去 
			循环体语句： 用于表示循环反复执行的内容，简单说就是循环反复执行的事情 
			条件控制语句：用于表示循环执行中每次变化的内容，简单说就是控制循环是否能执行下去 
	循环结构对应的语法： 
			初始化语句： 这里可以是一条或者多条语句，这些语句可以完成一些初始化操作 
			条件判断语句：这里使用一个结果值为boolean类型的表达式，这个表达式能决定是否执行循						环体。例如：a<3 
			循环体语句： 这里可以是任意语句，这些语句将反复执行 
			条件控制语句：这里通常是使用一条语句来改变变量的值，从而达到控制循环是否继续向下执行						的效果。常见i++,i--这样的操作 
```

```java
1.2 for循环语句格式 
		格式： for (初始化语句;条件判断语句;条件控制语句) {     
					循环体语句; 
					} 
 
	执行流程： ① 执行初始化语句 
			 ② 执行条件判断语句，看其结果是true还是false              
			 		如果是false，循环结束              
			 		如果是true，继续执行 
			 ③ 执行循环体语句 
			 ④ 执行条件控制语句 
			 ⑤ 回到②继续 
 
```

```java
public class ForDemo01 {
    public static void main(String[] args) {
        System.out.println("世界你好");
        System.out.println("世界你好");
        System.out.println("世界你好");
        System.out.println("世界你好");
        System.out.println("世界你好");
        //使用for循环代替
        for (int i = 0; i < 5; i++) {
            System.out.println("世界你好");
        }
    }
}
```

## 1.3 案例

```java

public class ForDemo02 {
    public static void main(String[] args) {
        //使用for循环实现1到5和5到1的输出
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("*******************");
        for (int i = 6; i > 1; i--) {
            System.out.println(i);
        }
    }
}
```

## 1.4 案例

```java
public class ForDemo03 {
    public static void main(String[] args) {
        //需求：求1-5之间的数据和，并把求和结果在控制台输出
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("第" + i+ "次循环\t" + "i : " + i + "\t" + "sum : " + sum);
            sum += i;
            System.out.println(sum);
            System.out.println("---------------------------");
        }

        /*
				sum += i;	sum = sum + i;
				第一次：sum = sum + i = 0 + 1 = 1;
				第二次：sum = sum + i = 1 + 2 = 3;
				第三次：sum = sum + i = 3 + 3 = 6;
				第四次：sum = sum + i = 6 + 4 = 10;
				第五次：sum = sum + i = 10 + 5 = 15;
		*/
    }
}
```

## 1.5 案例

```java
public class ForDemo04 {
    public static void main(String[] args) {
        /*
        求偶数和

	需求：
		求1-100之间的偶数和，并把求和结果在控制台输出
         */
        int evenNumber = 0;
        for (int i = 1; i <101 ; i++) {
            System.out.println("第" + i+ "次循环");
            //System.out.println("****************");
            if(i % 2 == 0) {
                System.out.println("i : " + i);
                System.out.println(evenNumber += i);
                System.out.println("------------");
            } else {
                System.out.println("第" + i+ "次循环是奇数" + "\n" + "******************");
            }
        }
```

## 1.6 案例

```java
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
```

## 1.7 案例

```java
需求：统计“水仙花数”一共有多少个，并在控制台输出个数 
案例：统计 
分析： ① 定义变量count，用于保存“水仙花数”的数量，初始值为0 
 
② 在判定水仙花数的过程中，满足条件不再输出，更改为修改count的值，使count+1 
 
 
③ 打印输出最终结果 
int count = 0; 
if ( a*a*a + b*b*b + c*c*c == 原数) {       count++;   } 
System.out.println("水仙花共有：" +count+ "个"); 
```

```java
public class ForDemo06 {
    public static void main(String[] args) {
	//统计水仙花数
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
```

