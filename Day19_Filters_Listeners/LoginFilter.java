import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

    public void init(
            FilterConfig filterConfig) {

        System.out.println(
                "Login Filter Initialized");
    }

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)

            throws IOException,
            ServletException {

        HttpServletRequest req =
                (HttpServletRequest) request;

        HttpSession session =
                req.getSession(false);

        if (session != null) {

            chain.doFilter(
                    request,
                    response);

        } else {

            response.getWriter().println(
                    "<h2>Please Login First</h2>");
        }
    }

    public void destroy() {

        System.out.println(
                "Login Filter Destroyed");
    }
}