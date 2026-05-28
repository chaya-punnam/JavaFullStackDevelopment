import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet
        extends HttpServlet {

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        String username =
                request.getParameter("username");

        String password =
                request.getParameter("password");

        out.println(
                "<h1>Welcome "
                + username + "</h1>");

    }
}