/**
 * Created with IntelliJ IDEA.
 * Description:
 * 方法名：要采用小驼峰的形式
 * public static 返回值 方法名（形式参数列表） {
 *     方法体;
 * }
 * public static : 因为当前所有的方法 写完之后 会在mian方法调用
 * 因为 mian 方法是 public static 的
 * User: SweiJ
 * Date: 2021-10-17
 * Time: 12:20
 */
public class Method {

    /**
     * 方法的重载（overload）
     *      1.方法名相同
     *      2.返回值不作要求
     *      3.参数列表不同（参数的个数 或者 参数的类型 不同）
     *      4.同一个类当中
     *  面试题：
     *      重载和重写的区别是什么？
     * @param args
     * @return
     */
    public static void main(String[] args) {
        double x = 10.3, y = 10.4;
        System.out.println(sum(x, y));
        System.out.println(Sum(5));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
    public static double sum(double x, double y) {
        return x + y;
    }

    public static int Sum(int num) {
        if(num == 1)
            return 1;
        else
            return num + Sum(num - 1);
    }

    public static int func(int num) {
        if(num < 10)
            return num;
        else
            return num % 10 + func(num / 10);
    }

    public static void main1(String[] args) {
        int a = 10, b = 20;
        int ret = sum(a, b);
        System.out.println(ret);
        int ret1 = sum(20, 30); // 直接传值
        System.out.println(ret1);

        int num1,num2,num3;
        num1 = 4;
        num2 = 7;
        num3 = 10;
        if(num1 > num2)
        {
            if(num1 > num3)
                System.out.println(num1);
            else
                System.out.println(num3);
        }
        else if(num2 > num3)
            System.out.println(num2);
        else
            System.out.println(num3);
    }
}
