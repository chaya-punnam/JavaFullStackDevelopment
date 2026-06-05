import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DashboardServlet
        extends HttpServlet {

    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response)

            throws IOException {

        response.setContentType(
                "text/html");

        PrintWriter out =
                response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println(
                "<h2>Welcome To Dashboard</h2>");

        out.println(
                "<p>Filter Allowed Access</p>");

        out.println("</body>");
        out.println("</html>");
    }
}