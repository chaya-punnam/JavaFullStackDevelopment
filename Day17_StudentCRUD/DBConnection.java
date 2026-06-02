package Day17_StudentCRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection()
            throws Exception {

        Class.forName(
                "com.mysql.cj.jdbc.Driver");

        Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/javafullstack",
                        "root",
                        "Prasanna@123");

        return con;
    }
}
