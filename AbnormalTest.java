import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SweiJ
 * Date: 2021-11-23
 * Time: 19:33
 */
public class AbnormalTest {

    private static String name = "С��";
    private static String pass = "666888";
    private static void loginException(String name, String pass) throws UserException, PassException {
        if(!AbnormalTest.name.equals(name)) {
            throw new UserException("�û�������");
        }
        if(!AbnormalTest.pass.equals(pass)) {
            throw new PassException("�������");
        }
        System.out.println("��½�ɹ���");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�������û�����>");
        String name = scanner.nextLine();
        System.out.print("���������룺>");
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
