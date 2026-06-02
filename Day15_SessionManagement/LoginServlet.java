import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet
        extends HttpServlet {

    public void doPost(

            HttpServletRequest request,

            HttpServletResponse response)

            throws IOException,
            ServletException {

        String username =

                request.getParameter(
                        "username");

        HttpSession session =

                request.getSession();

        session.setAttribute(
                "username",
                username);

        response.sendRedirect(
                "home.jsp");
    }
}