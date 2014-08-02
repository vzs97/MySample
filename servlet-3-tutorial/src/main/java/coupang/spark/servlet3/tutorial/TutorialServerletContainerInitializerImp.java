package coupang.spark.servlet3.tutorial;

import coupang.spark.servlet3.common.TutorialServletContainerInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/2/14
 * Time: 8:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TutorialServerletContainerInitializerImp implements TutorialServletContainerInitializer{
    @Override
    public void onStartup(ServletContext servletContext) {

        ServletRegistration.Dynamic servletRegist = servletContext.addServlet("HttpServletWithoutAnnotation", HttpServletWithoutAnnotation.class);

        servletRegist.addMapping("/annotation");

        System.out.println("Initialized annotation servlet");

    }
}
