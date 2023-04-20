package org.spring.jdbc;


import org.spring.jdbc.dao.StudentDao;
import org.spring.jdbc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("_____________my program started_____________");
        // getting object of JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbcconfig.xml");
       // JdbcTemplate template = context.getBean("jdbcTemplate" , JdbcTemplate.class);

        // insert query
          //String insert = "insert into student (id,name,city) values(?,?,?)";
        // fire query
        //int result = template.update(insert , 111,"Arpit jain","Kanpur");
        //System.out.println("number of record inserted : " + result);

//        after creating bean of student and dao (inserting)
       StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        Student student = new Student();
//        student.setId(333);
//        student.setName("Bhuvnesh");
//        student.setCity("Moradabad");

//        Updating
//        Student student = new Student();
//        student.setId(333);
//        student.setName("Bhuvnesh Jain");
//        student.setCity("Moradabad Jain");
//
//        int r  = studentDao.change(student);
//
//        System.out.println("student update number : " + r);

//        deleting
        Student student = new Student();
        student.setId(333);

        int r  = studentDao.delete(student);
        System.out.println("student update number : " + r);

    }
}
