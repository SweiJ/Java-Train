/**
 * Created with IntelliJ IDEA.
 * Description:
 * ��������Ҫ����С�շ����ʽ
 * public static ����ֵ ����������ʽ�����б� {
 *     ������;
 * }
 * public static : ��Ϊ��ǰ���еķ��� д��֮�� ����mian��������
 * ��Ϊ mian ������ public static ��
 * User: SweiJ
 * Date: 2021-10-17
 * Time: 12:20
 */
public class Method {

    /**
     * ���������أ�overload��
     *      1.��������ͬ
     *      2.����ֵ����Ҫ��
     *      3.�����б�ͬ�������ĸ��� ���� ���������� ��ͬ��
     *      4.ͬһ���൱��
     *  �����⣺
     *      ���غ���д��������ʲô��
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
        int ret1 = sum(20, 30); // ֱ�Ӵ�ֵ
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
