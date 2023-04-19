package org.springcore.springexpressionlanguage;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("springExpressionConfig.xml");

        System.out.println("_________________Prototype Scope________________");
        Student student = context.getBean("ob" ,Student.class);
        System.out.println(student.hashCode()); // to get hashcode of bean : 360067785

        Student student1 = context.getBean("ob",Student.class);
        System.out.println(student1.hashCode()); // 360067785 NOTE : hashcode is same , meaning it will give same object

//      prototype scope using xml
        Teacher teacher = context.getBean("teacher" ,Teacher.class);
        Teacher teacher1 = context.getBean("teacher" , Teacher.class);
        System.out.println(teacher.hashCode()); //1436664465
        System.out.println(teacher1.hashCode()); //558187323

        System.out.println( "Hello World!" );
    }
}
