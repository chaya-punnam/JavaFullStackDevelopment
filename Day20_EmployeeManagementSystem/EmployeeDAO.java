import java.sql.*;

public class EmployeeDAO {

    public static int addEmployee(
            Employee emp)
            throws Exception {

        Connection con =
                DBConnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement(

                        "INSERT INTO employee VALUES(?,?,?,?)");

        ps.setInt(
                1,
                emp.getId());

        ps.setString(
                2,
                emp.getName());

        ps.setString(
                3,
                emp.getDepartment());

        ps.setDouble(
                4,
                emp.getSalary());

        int result =
                ps.executeUpdate();

        con.close();

        return result;
    }
}