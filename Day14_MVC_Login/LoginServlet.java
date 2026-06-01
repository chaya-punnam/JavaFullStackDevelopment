import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        String username =
                request.getParameter("username");

        String password =
                request.getParameter("password");

        if(username.equals("admin")
                && password.equals("1234")) {

            RequestDispatcher rd =
                    request.getRequestDispatcher(
                            "success.jsp");

            rd.forward(request, response);

        }
        else {

            RequestDispatcher rd =
                    request.getRequestDispatcher(
                            "failure.jsp");

            rd.forward(request, response);

        }
    }
}