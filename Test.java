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
        // java���е��������� ��Ϊ2����
        // 1��������������
        // 2��������������  �࣬String�����飬�����࣬�ӿڣ�ö��...

        // java��8�л����������ͷֱ�Ϊ��
        // �ֽ���      1    2          2    4       8     4     8    û�й涨
        // ��������   byte char      short int     long float double boolean
        // ��װ��     Byte Character Short Integer Long Float Double Boolean

        int a = 20; // 4���ֽ�  Interger

        double d = 12.5; // 8���ֽ�  Double
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // �������һ��double���͵�ֵ��ֱ�Ӹ�ֵ��float �������
        // java ��һ��ǿ�������ԣ� C������һ������������
        // float -- Float ��һ����װ�� �ں���෽��
        float f = 12.3f; // 4���ֽ� Float
        System.out.println(f);

        // char  2���ַ�  Character
        // Unicode--> �����˺ܶ࣬���磺���ģ���ø����ˡ�
        char ch = 'a';
        char ch1 = 97;
        char ch2 = '��';
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);

        byte b = 12; // 1���ֽ� ��ֵ -128 - 127  Byte
        byte c = 21;
        System.out.println(b+" "+c);
        System.out.println(Byte.MAX_VALUE+1); // ���Ϊ128 Ĭ���������ν��д�ӡ

        short sh = 12; // 2���ֽ�   -32768 - 32767  Short

        // ��java��  ��������  û����ȷ�Ĵ�С  Boolean
        // ֻ������ȡֵ  true��flase
        // û����ν�� 0�Ǽ�  ��0����
        boolean flag = false;
        System.out.println(flag);

        String str = "hello";

        System.out.println("hello"+"world");
        System.out.println("hello"+10+20); // �����������ͺ��ַ���ʹ��+ƴ�ӣ��������һ���ַ���
        System.out.println(10+20+"hello"); // 30hello
        System.out.println(10+" "+20+"hello"); // " "��һ���ַ���

        short aa =128;
        byte bb =(byte) aa;
        System.out.println(bb);
        System.out.println(aa);
        double xx =2.0;
        int yy =4;
        xx /= ++yy;
        System.out.println(xx);

        Scanner scanner = new Scanner(System.in); // �Ӽ��̻�ȡһ�����ݣ�������ʹ�������������
        // String str1 = scanner.next(); // �����ո����
        // String str2 = scanner.nextLine(); // �����ַ���
        int n = scanner.nextInt();
        System.out.println(n);

        // Java�� ������Switch������������������Щ
        // 1��long   float   double  boolean
        // 2��JDK1.5��ʼ ����ö�٣�ö��Ҳ������Ϊswitch����
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
