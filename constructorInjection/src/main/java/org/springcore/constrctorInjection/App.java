package org.springcore.constrctorInjection;
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

        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Addition add = (Addition) context.getBean("add");
        add.sum();

    }
}
