package coupang.spark.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/3/14
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletResponse response) throws IOException {

        response.getWriter().println("Hello world!");

        return null;
    }

}
