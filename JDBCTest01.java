import com.mysql.jdbc.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SweiPC
 * Date: 2022-01-09
 * Time: 21:05
 */
public class JDBCTest01 {
    public static void main1(String[] args) throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/t1";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "jsw");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    public static void main2(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/t1";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "jsw");

        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    public static void main3(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/t1";
        String user = "root";
        String password = "jsw";

        DriverManager.registerDriver(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    public static void main4(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // ????????????
        Class.forName("com.mysql.jdbc.Driver");

        // ????????????
        String url = "jdbc:mysql://localhost:3306/t1";
        String user = "root";
        String password = "jsw";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

        // ??????sql
        String sql = "update account set money = 3000 where id = 5";

        // ????????????sql????????? Statement
        Statement stmt = connection.createStatement();

        // ??????sql
        int count = stmt.executeUpdate(sql);

        // ????????????
        System.out.println(count > 0 ? "????????????" : "????????????");

        // ????????????
        stmt.close();
        connection.close();
    }

    public static void main5(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // ????????????
        Class.forName("com.mysql.jdbc.Driver");

        // ????????????
        String url = "jdbc:mysql://localhost:3306/t1";
        String user = "root";
        String password = "jsw";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

        // ??????sql
        String sql = "update account set money = 3000 where id = 5";

        // ????????????sql????????? Statement
        Statement stmt = connection.createStatement();

        // ??????sql
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            int id = rs.getInt("id");
            String name  = rs.getString("name");
            Double money = rs.getDouble("money");

            System.out.println(id + name + money);
        }

        // ????????????
        rs.close();
        stmt.close();
        connection.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}

