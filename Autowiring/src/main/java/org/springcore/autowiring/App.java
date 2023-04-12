package org.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringconfig.xml");
        // autowiring with xml
//        AutowiringByXml autowiringByXml = context.getBean("autowiringByXml", AutowiringByXml.class);
//        System.out.println(autowiringByXml);

        // autowiring with annotation
        AutowiringWithAnnotation autowiringWithAnnotation = context.getBean("autowiringWithAnnotation",AutowiringWithAnnotation.class);
        System.out.println(autowiringWithAnnotation);
    }
}
