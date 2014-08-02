package coupang.spark.servlet3.common;

import java.lang.reflect.Modifier;
import java.util.Set;

import javax.servlet.Servlet;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

//since our HandlesTypes annotation contains the class Servlet, then all classes within the
//application that implement Servlet will be sent to the onStartup method below
//@HandlesTypes({javax.servlet.Servlet.class, TutorialServletContainerInitializer.class})
public class ServletContainerInitializerImpl /*implements ServletContainerInitializer */{

	//@Override
	public void onStartup(Set<Class<?>> setOfClassesInterestedIn, ServletContext context) throws ServletException {

/*

        for (Class<?> waiClass : setOfClassesInterestedIn) {

            if(!waiClass.isInterface()
                    &&!Modifier.isAbstract(waiClass.getModifiers())){

                if(Servlet.class.isAssignableFrom(waiClass)){
                    context.addServlet("Hello", Servlet.class.cast(waiClass));
                }

                if(TutorialServletContainerInitializer.class.isAssignableFrom(waiClass)){
                    TutorialServletContainerInitializer.class.cast(waiClass).onStartup(context);
                }

            }

        }
*/


	}

}
