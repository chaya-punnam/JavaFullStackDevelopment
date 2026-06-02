import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        request.setAttribute(
                "student",
                "Chaya");

        RequestDispatcher rd =
                request.getRequestDispatcher(
                        "welcome.jsp");

        rd.forward(
                request,
                response);
    }
}