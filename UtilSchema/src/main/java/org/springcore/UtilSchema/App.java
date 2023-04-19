package org.springcore.UtilSchema;

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

       ApplicationContext context = new  ClassPathXmlApplicationContext("UtilSchemaconfig.xml");

       // collection Dependency injection
//       Emp emp1 = (Emp)context.getBean("emp1");
//        System.out.println(emp1);


        // to get to know default list name
       // System.out.println(emp1.getPhones().getClass().getName());

        // standlone collection using Util Schema
        Person person1 = context.getBean("person1" , Person.class);
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());

        System.out.println("_______________________________");
        Person person2 = context.getBean("person2",Person.class);
        System.out.println(person2.getFeeStructure());
        System.out.println(person2.getFeeStructure().getClass().getName());


        System.out.println("_______________Properties standlone using util schema________________");
        Person person3 = context.getBean("person3" , Person.class);
        System.out.println(person3.getProperties());
        System.out.println(person3.getProperties().getClass().getName());
    }
}
