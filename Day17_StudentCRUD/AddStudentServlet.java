package Day17_StudentCRUD;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class AddStudentServlet
        extends HttpServlet {

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        try {

            int id =
                    Integer.parseInt(
                            request.getParameter("id"));

            String name =
                    request.getParameter("name");

            String course =
                    request.getParameter("course");

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO student_crud VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);

            int result =
                    ps.executeUpdate();

            PrintWriter out =
                    response.getWriter();

            if(result > 0) {

                out.println(
                        "<h2>Student Added Successfully</h2>");

                out.println(
                        "<a href='addStudent.jsp'>Add Another Student</a>");

            } else {

                out.println(
                        "<h2>Failed To Add Student</h2>");
            }

            con.close();

        }
        catch(Exception e) {

            response.getWriter().println(
                    "<h2>Error : " + e + "</h2>");
        }
    }
}
