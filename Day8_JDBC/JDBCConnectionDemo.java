package Day8_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCConnectionDemo {
    public static void main(String[] args) {
        try {
            Class.forName(
                    "com.mysql.cj.jdbc.Driver");
            Connection con =
                    DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javafullstack",
                    "root",
                    "Prasanna");
            System.out.println(
                    "Database Connected Successfully");
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}