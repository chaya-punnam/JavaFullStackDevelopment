package Day20_EmployeeManagementSystem;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewEmployeeServlet
        extends HttpServlet {

    public void doGet(

            HttpServletRequest request,

            HttpServletResponse response)

            throws IOException {

        response.getWriter().println(
                "<h2>Employee List Page</h2>");
    }
}
