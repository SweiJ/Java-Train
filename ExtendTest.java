package extend; // 类所在的包

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SweiJ
 * Date: 2021-11-14
 * Time: 9:09
 */
public class ExtendTest{
    public static void main(String[] args) {
        Ia aa = new AA();
        System.out.println(Ia.name);
    }
}
interface Ia{
    public static String name = "";
    abstract void fun();
}
interface Ib extends Ia{
    abstract void func();
}
class AA implements Ib{
    @Override
    public void func() {
        System.out.println("AA.function");
    }
    @Override
    public void fun() {
        System.out.println("AA.fun");
    }
}