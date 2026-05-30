import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class StudentRegistrationServlet extends HttpServlet {

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        try {

            int id =
                    Integer.parseInt(
                            request.getParameter("id"));

            String name =
                    request.getParameter("name");

            String course =
                    request.getParameter("course");

            Class.forName(
                    "com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/javafullstack",
                            "root",
                            "Prasanna@123");

            String query =
                    "INSERT INTO students_web VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);

            int result =
                    ps.executeUpdate();

            if (result > 0) {

                out.println("<html>");
                out.println("<body>");

                out.println(
                        "<h2>Registration Successful</h2>");

                out.println(
                        "<a href='registration.html'>Add Another Student</a>");

                out.println("</body>");
                out.println("</html>");

            } else {

                out.println(
                        "<h2>Registration Failed</h2>");

            }

            con.close();

        } catch (Exception e) {

            out.println(
                    "<h2>Error : " + e + "</h2>");

        }

    }
}