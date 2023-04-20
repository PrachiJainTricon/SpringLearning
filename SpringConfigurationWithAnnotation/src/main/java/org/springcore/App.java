package org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       // ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigWithAnnotation.xml");
        //Student student = (Student) context.getBean("firstStudent");

        // to close the application context
        //context.close();

        // annotation based configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        //Student student = context.getBean("firstStudent" , Student.class);
        Student student = context.getBean("con" , Student.class);
        System.out.println(student);
        student.study();
    }
}
