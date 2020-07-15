# 1  JavaCompiler

## 	 1.0 JAVA编译器(JavaCompile)

```java
1. Java语言是美国Sun公司（Stanford University Network）在1995年推出的计算机语言 
2. Java之父：詹姆斯·高斯林（James Gosling）

3. Java程序可以在任意操作系统上运行 ，是跨平台的。只需要在操作系统上安装Java虚拟机即可。
	Java
	  |
	  |
	 JVM(JAVA虚拟机)，虚拟机就是实现跨平台的有利武器。
	  |
	  |
 各个操作系统
 
4. JRE和JDK
 	1. JRE  (Java Runtime Environment)
 		* 是Java程序的运行时环境，包含 JVM 和运行时所需要的核心类库。 
 		* 我们想要运行一个已有的Java程序，那么只需安装 JRE 即可。 
 	2. JDK  (Java Development Kit) 
 		* 是Java程序开发工具包，包含 JRE 和开发人员使用的工具。 
 		* 其中的开发工具：编译工具（javac.exe）和运行工具（java.exe）。 
 		* 我们想要开发一个全新的Java程序，那么必须安装 JDK 。 
 		
 	总结：简单来说JDK包括了JRE(运行时环境)和开发工具(Javac.exe,Java.exe)
 		 JRE包括了JVM(Java虚拟机)和核心类库
 		 
5. JDK的安装和下载 	
	1.Sun公司已经被甲骨文公司收购，所以下载时，在百度中搜索Javase即可。
	2.安装时，需要安装在c盘以外的磁盘，因为c盘系统会限制读写权限，所以为了避免发生问题，建议自定       义安装，不选择默认安装。
	
	3.环境变量设置
		* 在系统高级设置-->高级-->环境变量-->系统变量-->新建，键入一个见名知意的词汇，作为变           量名，比如大写的JAVAHOM或者JAVA_HOME。选择安装目录即可，选择bin目录的上一           	   级目录。		
		* 双击系统变量中的Path，点击新建，输入%%\bin,然后把系统变量中的变量名放到两个百分号之			间即可。一路确定即可。
	4. 验证环境变量
		* 打开运行或者Powershell或者Win键+R键，输入Java和Javac测试。
6. JDK的安装目录 
	bin 	该路径下存放了JDK的各种工具命令。javac和java就放在这个目录。 
	conf 	该路径下存放了JDK的相关配置文件。 
	include 该路径下存放了一些平台特定的头文件。 	
	jmods 	该路径下存放了JDK的各种模块。 
	legal 	该路径下存放了JDK各模块的授权文档。 
	lib 	该路径下存放了JDK工具的一些补充JAR包。 
7. JavaAPI
	详细请查看API文档
```



## 1.1 第一个Java程序

```java
    
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("HelloWorld");
        }
    }
    
```

## 2.0 基础语法(Basic grammar)

### 2.1 关键字(keyword)

```java
1.关键字是指Java语言赋予了特殊含义的单词
2.关键字的特点：
	*关键字的字母都是小写
	*常用的代码编辑器对关键字有高亮显示，比如现在我们能看到了public,class,static等。
```

### 2.2 常量(Constant)

```java
1.常量：在程序运行过程中，其值不可以发生改变的量。
2.Java中的常量分类：

	1.字符串常量	用双引号括起来的多个字符（包含0个或多个）
	2.整数常量	 整数
	3.小数常量	 小数
	4.字符常量	 用单引号括起来的一个字符
	5.布尔常量	 布尔值，表示真假，只有两个值true和false
	6.空常量		  一个特殊的值，空值，值为null
	
3.除空常量外，其他常量均可使用输出语句直接输出。

总结：常量有6种，1.字符串常量 2.整数常量 3.小数常量 4.字符常量 5.布尔常量 6.空常量(输出语句无法输出)	
```

```java
public class ConstantDemo03 {
    public static void main(String[] args) {
        /**
         常量：
                在程序运行过程中，其值不可以发生改变的量。

         常量分类：
                 字符串常量：	用双引号括起来的内容。"HelloWorld","黑马程序员"
                 整数常量：		不带小数的数字。666,-88
                 小数常量：		带小数的数字。13.14,-5.21
                 字符常量：		用单引号括起来的内容。'A','0','我'
                 布尔常量：		布尔值，表示真假。true,false
                 空常量：		一个特殊的值，空值。null
         */
        //字符串常量
        System.out.println("HelloWorld");
        System.out.println("黑马");
        System.out.println("---------------");

        //整数常量
        System.out.println(666);
        System.out.println(-88);
        System.out.println("---------------");

        //小数常量
        System.out.println(3.14156921513);
        System.out.println(5.21);
        System.out.println("---------------");

        //字符常量
        System.out.println('我');
        //System.out.println('你号码');    无论中英文只能输出一个字符
        System.out.println('A');
        System.out.println('a');
        System.out.println("---------------");

        //布尔常量
        System.out.println(true);
        System.out.println(false);
        System.out.println("---------------");

        //空常量

        //空常量是不能直接输出的
        //System.out.println(null);
    }
}
```

### 2.3 注释(Annotation)

```java
public class AnnotationDemo04 {
    public static void main(String[] args) {
        /**
         * 1.注释分为三类：
         *      单行注释    符号  //
         *      多行注释    符号  /* 2
         *      文档注释    符号  当前就是文档注释
         *
         */
         
        //System.out.println("你好吗");

        /*System.out.println(10);*/

        /** System.out.println(1+1);
         * 
         */
    }
}
```

### 2.4 数据类型(DataType)

```java
1.Java是一个强类型语言，Java中的数据必须明确数据类型。
2.Java中的数据类型包括基本数据类型和引用数据类型两种。
3.Java中的基本数据类型：
        整型：
            byte	占1个字节
            short	占2个字节
            int	占4个字节
            long	占8个字节
        浮点型：
            float	占4个字节
            double	占8个字节
        字符型：
            char	占2个字节
        布尔型：	boolean	占1个字节
4.Java中，整数默认是int类型，浮点数默认是double类型。

```

![](C:\Users\wzj\Pictures\数据类型.jpg)

![](C:\Users\wzj\Pictures\数据类型1.jpg)

### 2.41 变量()

```java
public class VariableDemo01 {
    public static void main(String[] args) {
        /**
        变量定义格式：
		    数据类型 变量名 = 变量值;

	    基本数据类型：
		    byte,short,int,long,float,double,char,boolean

	    变量的使用：
		    取值格式：变量名

		    修改值格式：变量名 = 变量值;
        */

        //定义变量
        int a = 10;

        //输出变量
        System.out.println("初始化时的值" + a);

        //修改变量
        a = 20;
        System.out.println("修改后的值" + a);
    }
}
```



```java
public class VariableDemo02 {
    public static void main(String[] args) {
        /**
        变量使用的注意事项：
            名字不能重复
            变量未赋值，不能使用
            long类型的变量定义的时候，为了防止整数过大，后面要加L
            float类型的变量定义的时候，为了防止类型不兼容，后面要加F

        */
        
        //定义byte类型的变量
        byte b = 10;
        System.out.println(b);
        //定义short类型的变量
        short s = 2000;
        System.out.println(s);
        //定义int类型的变量
        int i = 888888888;
        System.out.println(i);
        //定义double类型的变量
        double d = 999999999;
        System.out.println(d);
        double dd = 999999999.9;
        System.out.println(dd);
        //定义char类型的变量
        char c = 'a';
        System.out.println(c);
        //定义boolean类型的变量
        //boolean b = true;
        //System.out.println(b);
        boolean bb = true;
        System.out.println(bb);
        //定义long类型的变量
        long l = 666666666666666666L;
        System.out.println(l);
        //定义float类型的变量
        float f = 3.1415936F;
        System.out.println(f);

    }
}
```

### 2.5 标识符()

```
1.驼峰命名法：
	*小驼峰命名法：用于对方法和变量命名，名字只有一个单词时，全部小写，当名字是两单词时，第一个单词小					写，从第二个单词开始，单词首字母大写。
	
	*大驼峰命名法：用于对类命名，名字只有一个单词时首字母大写，有两单词时，每个单词的首字母都大					写。
```

### 2.6 API

```
Java基本类型共有八种，基本类型可以分为三类，字符类型char，布尔类型boolean以及数值类型byte、short、int、long、float、double。数值类型又可以分为整数类型byte、short、int、long和浮点数类型float、double。JAVA中的数值类型不存在无符号的，它们的取值范围是固定的，不会随着机器硬件环境或者操作系统的改变而改变。实际上，JAVA中还存在另外一种基本类型void，它也有对应的包装类 java.lang.Void，不过我们无法直接对它们进行操作。8 中类型表示范围如下：

byte：8位，最大存储数据量是255，存放的数据范围是-128~127之间。

short：16位，最大数据存储量是65536，数据范围是-32768~32767之间。

int：32位，最大数据存储容量是2的32次方减1，数据范围是负的2的31次方到正的2的31次方减1。

long：64位，最大数据存储容量是2的64次方减1，数据范围为负的2的63次方到正的2的63次方减1。

float：32位，数据范围在3.4e-45~1.4e38，直接赋值时必须在数字后加上f或F。

double：64位，数据范围在4.9e-324~1.8e308，赋值时可以加d或D也可以不加。

boolean：只有true和false两个取值。

char：16位，存储Unicode码，用单引号赋值。

Java决定了每种简单类型的大小。这些大小并不随着机器结构的变化而变化。这种大小的不可更改正是Java程序具有很强移植能力的原因之一。下表列出了Java中定义的简单类型、占用二进制位数及对应的封装器类。

```

![](C:\Users\wzj\Pictures\数据类型3.jpg)

```
     
对于数值类型的基本类型的取值范围，我们无需强制去记忆，因为它们的值都已经以常量的形式定义在对应的包装类中了。如：

基本类型byte 二进制位数：Byte.SIZE最小值：Byte.MIN_VALUE最大值：Byte.MAX_VALUE

基本类型short二进制位数：Short.SIZE最小值：Short.MIN_VALUE最大值：Short.MAX_VALUE

基本类型char二进制位数：Character.SIZE最小值：Character.MIN_VALUE最大值：Character.MAX_VALUE

基本类型double 二进制位数：Double.SIZE最小值：Double.MIN_VALUE最大值：Double.MAX_VALUE

注意：float、double两种类型的最小值与Float.MIN_VALUE、 Double.MIN_VALUE的值并不相同，实际上Float.MIN_VALUE和Double.MIN_VALUE分别指的是 float和double类型所能表示的最小正数。也就是说存在这样一种情况，0到±Float.MIN_VALUE之间的值float类型无法表示，0 到±Double.MIN_VALUE之间的值double类型无法表示。这并没有什么好奇怪的，因为这些范围内的数值超出了它们的精度范围。

Float和Double的最小值和最大值都是以科学记数法的形式输出的，结尾的"E+数字"表示E之前的数字要乘以10的多少倍。比如3.14E3就是3.14×1000=3140，3.14E-3就是3.14/1000=0.00314。

Java基本类型存储在栈中，因此它们的存取速度要快于存储在堆中的对应包装类的实例对象。从Java5.0（1.5）开始，JAVA虚拟机（JavaVirtual Machine）可以完成基本类型和它们对应包装类之间的自动转换。因此我们在赋值、参数传递以及数学运算的时候像使用基本类型一样使用它们的包装类，但这并不意味着你可以通过基本类型调用它们的包装类才具有的方法。另外，所有基本类型（包括void）的包装类都使用了final修饰，因此我们无法继承它们扩展新的类，也无法重写它们的任何方法。

基本类型的优势：数据存储相对简单，运算效率比较高

包装类的优势：有的容易，比如集合的元素必须是对象类型，满足了java一切皆是对象的思想
```

