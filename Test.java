import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SweiJ
 * Date: 2021-10-10
 * Time: 13:33
 */
public class Test {
    public static void main(String[] args) {
        // java当中的数据类型 分为2大类
        // 1、基本数据类型
        // 2、引用数据类型  类，String，数组，抽象类，接口，枚举...

        // java中8中基本数据类型分别为：
        // 字节数      1    2          2    4       8     4     8    没有规定
        // 数据类型   byte char      short int     long float double boolean
        // 包装类     Byte Character Short Integer Long Float Double Boolean

        int a = 20; // 4个字节  Interger

        double d = 12.5; // 8个字节  Double
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 不允许把一个double类型的值，直接赋值给float 编译错误
        // java 是一个强类型语言， C语言是一个弱类型语言
        // float -- Float 是一个包装类 内含许多方法
        float f = 12.3f; // 4个字节 Float
        System.out.println(f);

        // char  2个字符  Character
        // Unicode--> 包含了很多，比如：中文，变得更大了。
        char ch = 'a';
        char ch1 = 97;
        char ch2 = '姜';
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);

        byte b = 12; // 1个字节 数值 -128 - 127  Byte
        byte c = 21;
        System.out.println(b+" "+c);
        System.out.println(Byte.MAX_VALUE+1); // 结果为128 默认是以整形进行打印

        short sh = 12; // 2个字节   -32768 - 32767  Short

        // 在java中  布尔类型  没有明确的大小  Boolean
        // 只有两个取值  true和flase
        // 没有所谓的 0是假  非0是真
        boolean flag = false;
        System.out.println(flag);

        String str = "hello";

        System.out.println("hello"+"world");
        System.out.println("hello"+10+20); // 其他数据类型和字符串使用+拼接，结果就是一个字符串
        System.out.println(10+20+"hello"); // 30hello
        System.out.println(10+" "+20+"hello"); // " "是一个字符串

        short aa =128;
        byte bb =(byte) aa;
        System.out.println(bb);
        System.out.println(aa);
        double xx =2.0;
        int yy =4;
        xx /= ++yy;
        System.out.println(xx);

        Scanner scanner = new Scanner(System.in); // 从键盘获取一个数据，不建议使用这种输入输出
        // String str1 = scanner.next(); // 遇到空格结束
        // String str2 = scanner.nextLine(); // 输入字符串
        int n = scanner.nextInt();
        System.out.println(n);

        // Java中 不能做Switch参数的数据类型有哪些
        // 1、long   float   double  boolean
        // 2、JDK1.5开始 引用枚举：枚举也可以作为switch参数
        switch ("hello") {
            case "abcde":
                System.out.println("1");
                break;
            case "hello":
                System.out.println("2");
                break;
        }
    }
    public static void main1(String[] args) {
        System.out.println("hello");
         for (int i = 0; i < 10; i++) {
            System.out.println("student.main");
            System.out.println("args = " + Arrays.deepToString(args));
            System.out.println("i = " + i);
        }
    }
}
