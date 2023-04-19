package org.springcore.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springExpressionConfig.xml");
        Demo d1 = context.getBean("demo" , Demo.class);
        System.out.println(d1);

        // expression using
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("2 +74"); // direct pass the expression
        System.out.println(expression.getValue());


    }
}
