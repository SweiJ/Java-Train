import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SweiJ
 * Date: 2021-11-23
 * Time: 19:33
 */
public class AbnormalTest {

    private static String name = "小明";
    private static String pass = "666888";
    private static void loginException(String name, String pass) throws UserException, PassException {
        if(!AbnormalTest.name.equals(name)) {
            throw new UserException("用户名错误！");
        }
        if(!AbnormalTest.pass.equals(pass)) {
            throw new PassException("密码错误！");
        }
        System.out.println("登陆成功！");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：>");
        String name = scanner.nextLine();
        System.out.print("请输入密码：>");
        String age = scanner.nextLine();

        try {
            AbnormalTest.loginException(name, pass);
        } catch (PassException e) {
            e.printStackTrace();
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}
class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
class PassException extends Exception {
    public PassException(String message) {
        super(message);
    }
}
