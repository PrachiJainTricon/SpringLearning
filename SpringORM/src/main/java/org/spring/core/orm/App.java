package org.spring.core.orm;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.spring.core.orm.dao.StudentDao;
import org.spring.core.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
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
        System.out.println("____________this while is part of spriing mvc_____________");
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
                       // Student student = new Student(657,"Sanjay Jain" ,"lucknow");
                        System.out.println("Enter student Id :");
                        int uId = Integer.parseInt(br.readLine());
                        System.out.println("Enter Student Name :");
                        String uName = br.readLine();
                        System.out.println("Enter Student City : ");
                        String uCity = br.readLine();
                        Student student = new Student(uId,uName,uCity);
                        int r = studentDao.insert(student);
                        System.out.println("added user successfully  with Id: " + r);
                        System.out.println("*******************************************");
                        break;
                    case 2:
                        // Display All Student
                        System.out.println("__________All Student________");
                        List<Student> str = studentDao.getAllStudents();
                        for(Student student1 : str){
                            System.out.println("Student Name : " + student1.getStudentId() + "\nStudent Id : " + student1.getStudentName() + "\nStudent City :" + student1.getStudentCity());
                            System.out.println("______________________________________");
                        }

                        break;
                    case 3:
                        // display single student
                       // Student student1 = new Student("232");
                       // student1.getStudentCity("luckonw 222");
                        System.out.println("Give user Id : ");
                        int userId = Integer.parseInt(br.readLine());
                        Student result = studentDao.getStudent(userId);
                        System.out.println("Student Id: " + result.getStudentId() + "\nStudent Name: " + result.getStudentName() + "\nStudent City: " + result.getStudentCity());
                        System.out.println("_________________________________________");
                        break;
                    case 4:
                        // Delete student
                        //Student student2 = new Student("232");
                        System.out.println("_________Delete method______\n Give ID : " );
                        int stdId = Integer.parseInt(br.readLine());

                        studentDao.deleteStudent(stdId);
                        System.out.println("________Deleted____________" );
                        break;
                    case 5:
                        // update Student
                        System.out.println("________________Student Updated Method_____________");

                        System.out.println("Enter the Id to be Updated");
                        int updateId = Integer.parseInt(br.readLine());

                        System.out.println("Enter the choice");
                        System.out.println("Press 1 to update Name");
                        System.out.println("Press 1 to update City");
                        int choice = Integer.parseInt(br.readLine());



                        Student student1 = studentDao.getStudent(updateId);

                        String updateName = student1.getStudentName();
                        String updateCity = student1.getStudentCity();

                        switch (choice){
                            case 1 :
                                System.out.println("Enter the name to be updated");
                                updateName = br.readLine();
                                student1 = new Student(updateId,updateName,updateCity);
                                System.out.println("Name is updated!");
                                break;
                            case 2:
                                System.out.println("Enter the city name to be updated");
                                updateCity = br.readLine();
                                student1 = new Student();
                                student1.setStudentId(updateId);
                                student1.setStudentName(updateName);
                                student1.setStudentCity(updateCity);
                                System.out.println("City Updated!");

                        }
                        studentDao.updateStudent(student1);
                        System.out.println("updated successfully!");
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
