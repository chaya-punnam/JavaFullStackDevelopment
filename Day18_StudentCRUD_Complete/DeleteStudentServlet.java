package Day18_StudentCRUD_Complete;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class DeleteStudentServlet
        extends HttpServlet {

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        try {

            int id =
                    Integer.parseInt(
                            request.getParameter("id"));

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                            "DELETE FROM student_crud WHERE id=?");

            ps.setInt(1,id);

            int result =
                    ps.executeUpdate();

            if(result > 0) {

                response.getWriter().println(
                        "Student Deleted Successfully");

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
