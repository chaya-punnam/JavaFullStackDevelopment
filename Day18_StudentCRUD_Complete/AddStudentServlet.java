package Day18_StudentCRUD_Complete;

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

            PreparedStatement ps =
                    con.prepareStatement(
                            "INSERT INTO student_crud VALUES(?,?,?)");

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,course);

            ps.executeUpdate();

            response.getWriter().println(
                    "Student Added Successfully");

            con.close();

        } catch(Exception e) {

            response.getWriter().println(e);

        }
    }
}
