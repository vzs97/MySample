package coupang.spark.servlet3.tutorial;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/2/14
 * Time: 10:00 AM
 * To change this template use File | Settings | File Templates.
 */
@WebFilter(urlPatterns = "/*",initParams = {@WebInitParam(name="Hello",value = "World")})
public class HelloFilter implements Filter{

    private String filterName;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        filterName = filterConfig.getInitParameter("Hello") ;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //To change body of implemented methods use File | Settings | File Templates.
        try{
            System.out.println("Url=" + request.getRemoteAddr()+", Filter by " + filterName);
        }finally {
            chain.doFilter(request,response);
        }


    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
