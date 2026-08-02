import java.sql.*;

public class TestJDBC {
    public static void main(String args[]) {
        System.out.println("Start");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded Successfully!");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}