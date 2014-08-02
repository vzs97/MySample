package coupang.spark.servlet3.tutorial;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/2/14
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class HttpServletWithoutAnnotation extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello World! I have no annotation, registered by Servlet context.");
    }

}
