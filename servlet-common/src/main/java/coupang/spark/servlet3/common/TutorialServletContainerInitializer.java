package coupang.spark.servlet3.common;

import javax.servlet.ServletContext;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/1/14
 * Time: 2:27 PM
 * To change this template use File | Settings | File Templates.
 */
public interface TutorialServletContainerInitializer {

    public void onStartup(ServletContext servletContext);

}
