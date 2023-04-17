package org.springcore;

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
        System.out.println("student");
        ApplicationContext context =   new ClassPathXmlApplicationContext("config.xml");
        // inject primitive type
//        Student student = (Student) context.getBean("student1");
//        System.out.println(student);

        // inject collection type
//        StudentCollection studentCollection = (StudentCollection) context.getBean("emp1");
//        System.out.println(studentCollection);

        // inject reference type
        ReferenceA referenceA = context.getBean("aref" , ReferenceA.class);
        System.out.println(referenceA.getX());
        System.out.println(referenceA.getOb().getY());
        System.out.println(referenceA);
    }
}
