package coupang.spark.mvc.conf;

import coupang.spark.mvc.web.WebComponents;
import org.springframework.util.Assert;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/3/14
 * Time: 8:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class CoupangMvcInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        registerRootContext(servletContext);

        registerWeb(servletContext);
        
        registerApi(servletContext);
        

    }

    private void registerApi(ServletContext servletContext) {
        //To change body of created methods use File | Settings | File Templates.
    }

    private void registerWeb(ServletContext servletContext) {
        addDispatcherServlet(servletContext, "web", WebAppConf.class, "/");
    }

    private void addDispatcherServlet(ServletContext servletContext, String servletName, Class<?> servletContextConfigClass,
                                                               String... mappings) {

        AnnotationConfigWebApplicationContext servletApplicationContext = new AnnotationConfigWebApplicationContext();
        servletApplicationContext.register(servletContextConfigClass);

        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet(servletName, new DispatcherServlet(servletApplicationContext));

        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping(mappings);

    }

    private void registerRootContext(ServletContext servletContext) {

        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

        applicationContext.register(RootAppConf.class);


        servletContext.addListener(new ContextLoaderListener(applicationContext));
    }
}
