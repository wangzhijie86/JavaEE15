# 2  while循环and  Random 随机数

## 	2.1 while循环语句格式 

```java
基本格式： 
		while (条件判断语句) {     
				循环体语句; 
				} 
完整格式： 
		初始化语句; 
		while (条件判断语句) {     
		循环体语句;         
		条件控制语句; 
		} 
```

```java
执行流程： 
	① 执行初始化语句 
	② 执行条件判断语句，看其结果是true还是false             
    		如果是false，循环结束              
    		如果是true，继续执行 
    ③ 执行循环体语句 
    ④ 执行条件控制语句 
    ⑤ 回到②继续 
```

## 	2.2 演示

```java
public class WhileDemo01 {
    public static void main(String[] args) {
        /*
        while语句

    基本格式：
        while(条件判断语句) {
			循环体语句;
		}

	完整格式：
		初始化语句;
		while(条件判断语句) {
			循环体语句;
			条件控制语句;
		}

    执行流程：
        1:执行初始化语句
		2:执行条件判断语句，看其结果是true还是false
            如果是false，循环结束
            如果是true，继续执行
		3:执行循环体语句
		4:执行条件控制语句
		5:回到2继续
         */

        //需求：在控制台输出5次"HelloWorld"
        //for循环实现
        for(int i=1; i<=5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------");

        //while循环实现
        int j = 1;
        while(j<=5) {
            System.out.println("HelloWorld");
            j++;
        }
    }
}
```

## 2.3 案例

```java
需求：
	世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。 请问，我折叠多少次，可以折成珠穆朗玛峰的高度
	
	分析： ① 因为要反复折叠，所以要使用循环，但是不知道折叠多少 次，这种情况下更适合使用while循环 	while ( 条件判断语句 ) { 循环体 } 
 
② 循环的执行过程中每次纸张折叠，纸张的厚度要加倍，因 此需要先定义纸张厚度，在循环中使厚度加倍 
    double paper = 0.1;  while ( 条件判断语句 ) {  
     paper *= 2; 
    } 
③ 折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执 行的要求是纸张厚度小于珠峰高度 
     int zf = 8844430;  
    while ( paper <= zf ) { …… } 

④ 设置一个计数器，在循环中执行累加，对应折叠了多少次 

    int count = 0;  
    while ( paper <= zf ) { 
        count++; 
	} 
```

```java
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

```



# 3 do…while循环

## 	3.0

```java
基本格式： 
        do {     
        循环体语句; 
        }while(条件判断语句); 
        
完整格式： 
        初始化语句; 
        do {     
        循环体语句;     
        条件控制语句; 
        }while(条件判断语句);      
执行流程： 
		① 执行初始化语句 
		② 执行循环体语句 
		③ 执行条件控制语句 
		④ 执行条件判断语句，看其结果是true还是false 
            如果是false，循环结束 
            如果是true，继续执行 
		⑤ 回到②继续         
		
```

## 3.1 演示

```java
public class DoWhileDemo {
    public static void main(String[] args) {
        //需求：在控制台输出5次"HelloWorld"
        //for循环实现
        for(int i=1; i<=5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------");

        //do...while循环实现
        System.out.println("do while");
        int j = 0;
        do {
            System.out.println("世界你好");
            j++;
        } while (j < 5);

    }
}
```

## 3.2

```
3.2 三种循环的区别 

	三种循环的区别： 
		 for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行） 
		 do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判			断）
        
	for 和while的区别： 
		   条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能			再次被访问到了 
		   条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构中，在while循环结			束后，该变量还可以继续使用 
 
	死循环格式： 
			for(;;) { }  
			while(true) { }  
			do{ }while(true); 
 
while的死循环格式是最常用的 命令提示符窗口中Ctrl+C可以结束死循环 
```

```java
/*
	三种循环的区别
 */
public class ForForDemo {
    public static void main(String[] args) {
		/*
		//for循环
		for(int i = 3; i<3; i++) {
			System.out.println("我爱Java");
		}
		System.out.println("--------");

		//while循环
		int j = 3;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println("--------");

		//do...while循环
		int k = 3;
		do {
			System.out.println("我爱Java");
			k++;
		}while(k<3);
		*/

		/*

		//for循环     while循环会先执行后判断
		for(int i = 1; i<3; i++) {
			System.out.println("我爱Java");
		}
		//System.out.println(i);
		System.out.println("--------");

		//while循环      i和j的作用域不同，i作用域在for循环内，j贯穿循环内外
		int j = 1;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println(j);
		System.out.println("--------");
		*/

        //死循环
		/*
		for(;;) {
			System.out.println("for");
		}
		*/

		/*
		while(true) {
			System.out.println("while");
		}
		*/

        do {
            System.out.println("do...while");
        }while(true);
    }
}
```

# 4 跳转控制语句 

```
1.跳过某次循环体内容的执行 continue 注意：使用是基于条件控制的 
2.终止循环体内容的执行 break 注意：使用是基于条件控制的 
```

```java
public class ControlDemo {
    public static void main(String[] args) {
        /*
        continue:用在循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行
	break:用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环
         */

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                //continue;
                break;
            }
        }
    }
}

// continue 用在循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行
// break 用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环 
```

# 5 循环嵌套 

```
5.1 循环嵌套概述 

	语句结构： 
		 顺序语句 以分号结尾，表示一句话的结束
		 分支语句 一对大括号表示if的整体结构，整体描述一个完整的if语句 
				  一对大括号表示switch的整体结构，整体描述一个完整的switch语句 
 
		 循环语句 一对大括号表示for的整体结构，整体描述一个完整的for语句 
				  一对大括号表示while的整体结构，整体描述一个完整的while语句 
				  do..while以分号结尾，整体描述一个完整的do..while语句
 
  
任何语句对外都可以看成是一句话，一句代码 分支语句中包含分支语句称为分支嵌套 循环语句中包含循环语句称为循环嵌套 
	if ( 条件 ) {
    Syso... 
 	} 
 	
 	
	if ( 条件 ) {
    	if ( 条件 ) {       
    	}else {       
        } 

      
	for ( ;; ) {
    	for( ;; ) { 
        ....
        }
      }  
```

```java
/*
	循环嵌套：
		循环语句中包含循环语句

	需求：
		在控制台输出一天的小时和分钟

		分钟和小时的范围：
			分钟：0 <= minute < 60
			小时：0 <= hour < 24
*/
public class LoopTest {
    public static void main(String[] args) {
		/*
		System.out.println("0时0分");
		System.out.println("0时1分");
		System.out.println("0时2分");
		System.out.println("0时3分");
		System.out.println("--------");
		System.out.println("1时0分");
		System.out.println("1时1分");
		System.out.println("1时2分");
		System.out.println("1时3分");
		System.out.println("--------");
		System.out.println("2时0分");
		System.out.println("2时1分");
		System.out.println("2时2分");
		System.out.println("2时3分");
		*/

        //循环改进
		/*
		for(int minute=0; minute<4; minute++) {
			System.out.println("0时" + minute + "分");
		}
		System.out.println("--------");

		for(int minute=0; minute<4; minute++) {
			System.out.println("1时" + minute + "分");
		}
		System.out.println("--------");

		for(int minute=0; minute<4; minute++) {
			System.out.println("2时" + minute + "分");
		}
		System.out.println("--------");
		*/

        //外循环控制小时的范围，内循环控制分钟的范围
		/*
		for(int hour=0; hour<3; hour++) {
			for(int minute=0; minute<4; minute++) {
				System.out.println(hour + "时" + minute + "分");
			}
			System.out.println("--------");
		}
		*/
        //恒星和行星关系
        for(int hour=0; hour<24; hour++) {
            for(int minute=0; minute<60; minute++) {
                System.out.println(hour + "时" + minute + "分");
            }
            System.out.println("--------");
        }
    }
}
```

# 6. Random 

```
6.1Random的作用和使用步骤 
	作用：用于产生一个随机数 
	使用步骤：
		① 导包 import java.util.Random; 导包的动作必须出现在类定义的上面
		② 创建对象 Random r = new Random(); 上面这个格式里面，r 是变量名，可以变，其他的都			不允许变
		③ 获取随机数 
 			int number = r.nextInt(10);//获取数据的范围：[0,10) 包括0,不包括10 上面这			个格式里面，number是变量名，可以变，数字10可以变。其他的都不允许变 
 


```

```java
import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("number : " + number);

        //用循环获取10个随机数
        System.out.println("-------------------");
        for (int i = 0; i < 11; i++) {
            int number1 = random.nextInt(10);
            System.out.println(number1);
        }

        //需求：获取一个1-100之间的随机数
        System.out.println("-----------------------");
        int number2 = random.nextInt(100) + 1;
        System.out.println(number2);
    }
}
```



```
案例：猜数字 
需求：
    程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？ 当猜错的时候根据不同情况给出相应的提示  如果猜的数字比真实数字大，提示你猜的数据大了  如果猜的数字比真实数字小，提示你猜的数据小了  如果猜的数字与真实数字相等，提示恭喜你猜中了 
```

```
需求：程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？ 
案例：猜数字 
	分析： 
		① 要完成猜数字的游戏，首先需要有一个要猜的数字，使用随机数生 成该数字，范围1到100 
		② 因为无法预知几次能够猜中，因此猜数字这个操作应该是反复进行 的，需要使用循环，而while循环通常用于描述未知循环次数的循环 
		③ 使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘 录入实现 
		④ 比较输入的数字和系统产生的数据，需要使用分支语句。这里使用 if..else..if..格式，根据				不同情况进行猜测结果显示，当猜中后使用 break结束循环即可 
            Random r = new Random(); 
            int number = r.nextInt(100) + 1; 
            while (条件) { } 
            Scanner sc = new Scanner(System.in); 
            int guessNumber = sc.nextInt(); 
            if (条件：比要猜的数字大) {  } else if (条件：比要猜的数字小) {  } else {  				break;  } 	
```

```java
import java.util.Random;
import java.util.Scanner;

public class RandomDemo02 {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(99) + 1;

        while(true) {
            System.out.println("请输入要猜的数字");
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("您猜的数字大了");
            } else if(guessNumber < number) {
                System.out.println("您猜的数字小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
```

