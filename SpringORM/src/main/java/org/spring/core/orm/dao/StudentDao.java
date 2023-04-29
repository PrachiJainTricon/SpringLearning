package org.spring.core.orm.dao;

import org.spring.core.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    // save student
    @Transactional
    public int insert(Student student){
        // insert
        int i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    // get single template
    public Student getStudent(int studentId){
        // we can also use load
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        return student;
    }

    // get all student
    public List<Student> getAllStudents(){
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);

        return students;
    }

    // deleting the data
    @Transactional
    public void  deleteStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }

    // update student
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //
}
