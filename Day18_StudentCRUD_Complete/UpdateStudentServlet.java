package Day18_StudentCRUD_Complete;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class UpdateStudentServlet
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
                            "UPDATE student_crud SET name=?, course=? WHERE id=?");

            ps.setString(1,name);
            ps.setString(2,course);
            ps.setInt(3,id);

            int result =
                    ps.executeUpdate();

            if(result > 0) {

                response.getWriter().println(
                        "Student Updated Successfully");

            } else {

                response.getWriter().println(
                        "Student Not Found");
            }

            con.close();

        } catch(Exception e) {

            response.getWriter().println(e);

        }
    }
}
