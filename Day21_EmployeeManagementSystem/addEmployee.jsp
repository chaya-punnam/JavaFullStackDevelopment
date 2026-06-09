package Day21_EmployeeManagementSystem;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class AddEmployeeServlet
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

            String department =
                    request.getParameter("department");

            double salary =
                    Double.parseDouble(
                            request.getParameter("salary"));

            Employee emp =
                    new Employee(
                            id,
                            name,
                            department,
                            salary);

            int result =
                    EmployeeDAO.addEmployee(emp);

            if(result > 0) {

                response.getWriter().println(
                        "<h2>Employee Added Successfully</h2>");

                response.getWriter().println(
                        "<a href='addEmployee.jsp'>Add Another Employee</a>");
            }

        } catch(Exception e) {

            response.getWriter().println(e);
        }
    }
}