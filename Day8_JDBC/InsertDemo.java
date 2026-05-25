package Day8_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName(
                    "com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javafullstack",
                    "root",
                    "Prasanna@123");

            String query =
                    "INSERT INTO students VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            System.out.println("Enter ID:");

            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Name:");

            String name = sc.nextLine();

            System.out.println("Enter Course:");

            String course = sc.nextLine();

            ps.setInt(1, id);

            ps.setString(2, name);

            ps.setString(3, course);

            ps.executeUpdate();

            System.out.println(
                    "Record Inserted Successfully");

            con.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

        sc.close();

    }
}