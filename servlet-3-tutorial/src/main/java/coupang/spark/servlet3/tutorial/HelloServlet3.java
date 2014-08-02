package coupang.spark.servlet3.tutorial;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/1/14
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */


@WebServlet(asyncSupported=false, urlPatterns="/hello")
public class HelloServlet3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.getWriter().println("Hello World!");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
