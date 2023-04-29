package org.spring.core.orm;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.spring.core.orm.dao.StudentDao;
import org.spring.core.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("springormconfig.xml");

        StudentDao studentDao =  context.getBean("studentDao", StudentDao.class);
 //       System.out.println(studentDao);
//
//        Student student = new Student(342,"Sanjay Jain" ,"lucknow");
//
//        int r = studentDao.insert(student);
//
//        System.out.println("done" + r);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Boolean go = true;
        while(go) {
            System.out.println("PRESS 1 Add Student");
            System.out.println("PRESS 2 Display all Students");
            System.out.println("PRESS 3 Get single Student");
            System.out.println("PRESS 4 Delete student");
            System.out.println("PRESS 5 Update Student");
            System.out.println("PRESS 6 Exit");

            try {
                int input = Integer.parseInt(br.readLine());
                switch (input){
                    case 1:
                        // Add Student
                        Student student = new Student(657,"Sanjay Jain" ,"lucknow");
                        int r = studentDao.insert(student);
                        System.out.println("done : " + r);
                        break;
                    case 2:
                        // Display All Student
                        List<Student> str = studentDao.getAllStudents();
                        for(Student student1 : str){
                            System.out.println("Display all Students : " + student1);
                        }

                        break;
                    case 3:
                        // display single student
                       // Student student1 = new Student("232");
                       // student1.getStudentCity("luckonw 222");
                        Student result = studentDao.getStudent(Integer.parseInt("232"));
                        System.out.println("Display single Student : " + result);
                        break;
                    case 4:
                        // Delete student
                        //Student student2 = new Student("232");
                        studentDao.deleteStudent(232);
                        System.out.println("Deleted : " );
                        break;
                    case 5:
                        // update Student
                        Student student3 = new Student();
                        studentDao.updateStudent(student3);
                        System.out.println("updated");
                        break;
                    case 6:
                        // exit
                        go = false;
                        break;

                }

            }catch(Exception e){

                System.out.println("Invalid input !!");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Application ended");

    }
}
