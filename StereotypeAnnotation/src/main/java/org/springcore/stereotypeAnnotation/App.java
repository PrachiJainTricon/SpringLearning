package org.springcore.stereotypeAnnotation;

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

        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeAnntationConfig.xml");
        //Student student = (Student) context.getBean("student");
        //System.out.println(student);

        Student student = (Student) context.getBean("ob");
        System.out.println(student);

        System.out.println(student.getAddresses());
        System.out.println(student.getAddresses().getClass().getName());




    }
}
