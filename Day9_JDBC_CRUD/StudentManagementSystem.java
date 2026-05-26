package Day9_JDBC_CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class StudentManagementSystem {
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
            int choice;
            do {
                System.out.println(
                        "\n===== STUDENT MENU =====");
                System.out.println(
                        "1. Insert Student");
                System.out.println(
                        "2. View Students");
                System.out.println(
                        "3. Update Student");
                System.out.println(
                        "4. Delete Student");
                System.out.println(
                        "5. Exit");
                System.out.println(
                        "Enter Choice:");
                choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        String insertQuery =
                                "INSERT INTO students VALUES(?,?,?)";
                        PreparedStatement ps1 =
                                con.prepareStatement(insertQuery);
                        System.out.println(
                                "Enter Student ID:");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println(
                                "Enter Student Name:");
                        String name =
                                sc.nextLine();
                        System.out.println(
                                "Enter Course:");
                        String course =
                                sc.nextLine();
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, course);
                        ps1.executeUpdate();
                        System.out.println(
                                "Student Inserted Successfully");
                        break;
                    case 2:
                        Statement st =
                                con.createStatement();
                        ResultSet rs =
                                st.executeQuery(
                                "SELECT * FROM students");
                        System.out.println(
                                "\n--- STUDENT RECORDS ---");
                        while(rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getString(3));

                        }
                        break;
                    case 3:
                        String updateQuery =
                                "UPDATE students SET course=? WHERE id=?";
                        PreparedStatement ps2 =
                                con.prepareStatement(updateQuery);
                        System.out.println(
                                "Enter Student ID:");

                        int updateId =
                                sc.nextInt();

                        sc.nextLine();

                        System.out.println(
                                "Enter New Course:");

                        String newCourse =
                                sc.nextLine();

                        ps2.setString(1, newCourse);

                        ps2.setInt(2, updateId);

                        int rowsUpdated =
                                ps2.executeUpdate();

                        if(rowsUpdated > 0) {

                            System.out.println(
                                    "Record Updated Successfully");

                        }
                        else {

                            System.out.println(
                                    "Student Not Found");

                        }

                        break;

                    case 4:

                        String deleteQuery =
                                "DELETE FROM students WHERE id=?";

                        PreparedStatement ps3 =
                                con.prepareStatement(deleteQuery);

                        System.out.println(
                                "Enter Student ID:");

                        int deleteId =
                                sc.nextInt();

                        ps3.setInt(1, deleteId);

                        int rowsDeleted =
                                ps3.executeUpdate();

                        if(rowsDeleted > 0) {

                            System.out.println(
                                    "Record Deleted Successfully");

                        }
                        else {

                            System.out.println(
                                    "Student Not Found");

                        }

                        break;

                    case 5:

                        System.out.println(
                                "Thank You");

                        break;

                    default:

                        System.out.println(
                                "Invalid Choice");

                }

            } while(choice != 5);

            con.close();

        }
        catch(Exception e) {

            System.out.println(e);

        }

        sc.close();

    }
}