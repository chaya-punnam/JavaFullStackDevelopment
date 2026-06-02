package Day18_StudentCRUD_Complete;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ViewStudentsServlet
        extends HttpServlet {

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        try {

            Connection con =
                    DBConnection.getConnection();

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM student_crud");

            PrintWriter out =
                    response.getWriter();

            out.println("<html>");
            out.println("<body>");

            out.println("<h2>Student List</h2>");

            out.println("<table border='1'>");

            out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Course</th>");
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
                        + rs.getString("course")
                        + "</td>");

                out.println("</tr>");
            }

            out.println("</table>");

            out.println("</body>");
            out.println("</html>");

            con.close();

        } catch(Exception e) {

            response.getWriter().println(e);

        }
    }
}
