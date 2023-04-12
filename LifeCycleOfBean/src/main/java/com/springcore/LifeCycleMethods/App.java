package com.springcore.lifecyclemethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        LifeCycle lifecycle = (LifeCycle) context.getBean("lifecycle");
//        System.out.println(lifecycle);

        context.registerShutdownHook(); // this one used to destroy object



//        System.out.println("__________________LifecycleMethods with interface_________________");
//        ByInterface withinterface = context.getBean("withinterface",ByInterface.class);
//        System.out.println(withinterface);

        System.out.println("_____________________LifecycleMethods with Annotation____________________");
        LifeCycleByAnnotation lifeCycleByAnnotation = context.getBean("lifecycleannotation" ,LifeCycleByAnnotation.class);
        System.out.println(lifeCycleByAnnotation);

    }
}
