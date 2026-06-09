package Day21_EmployeeManagementSystem;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ViewEmployeeServlet
        extends HttpServlet {

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        try {

            ResultSet rs =
                    EmployeeDAO.getEmployees();

            PrintWriter out =
                    response.getWriter();

            out.println("<html>");
            out.println("<body>");

            out.println(
                    "<h2>Employee Records</h2>");

            out.println(
                    "<table border='1'>");

            out.println(
                    "<tr>");

            out.println("<th>ID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Department</th>");
            out.println("<th>Salary</th>");

            out.println("</tr>");

            while(rs.next()) {

                out.println("<tr>");

                out.println("<td>"
                        + rs.getInt("id")
                        + "</td>");

                out.println("<td>"
                        + rs.getString("name")
                        + "</td>");

                out.println("<td>"
                        + rs.getString("department")
                        + "</td>");

                out.println("<td>"
                        + rs.getDouble("salary")
                        + "</td>");

                out.println("</tr>");
            }

            out.println("</table>");

            out.println("<br><br>");

            out.println(
                    "<a href='addEmployee.jsp'>Add Employee</a>");

            out.println("</body>");
            out.println("</html>");

        } catch(Exception e) {

            response.getWriter().println(e);
        }
    }
}