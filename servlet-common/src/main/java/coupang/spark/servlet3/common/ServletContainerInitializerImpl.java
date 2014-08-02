package coupang.spark.servlet3.common;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.Set;

//since our HandlesTypes annotation contains the class Servlet, then all classes within the
//application that implement Servlet will be sent to the onStartup method below
@HandlesTypes({TutorialServletContainerInitializer.class})
public class ServletContainerInitializerImpl implements ServletContainerInitializer {

	//@Override
	public void onStartup(Set<Class<?>> setOfClassesInterestedIn, ServletContext context) throws ServletException {

        System.out.println("ServletContainerInitializerImpl on startup");


        for (Class<?> waiClass : setOfClassesInterestedIn) {

            if(!waiClass.isInterface()
                    &&!Modifier.isAbstract(waiClass.getModifiers())){

                if(TutorialServletContainerInitializer.class.isAssignableFrom(waiClass)){
                    try {
                        TutorialServletContainerInitializer.class.cast(waiClass.newInstance()).onStartup(context);
                    } catch (InstantiationException e) {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    }
                }

            }

        }


	}

}
