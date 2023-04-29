package org.spring.jdbc.annotation.dao;

import org.spring.jdbc.annotation.entity.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    // to update the record
    public int change(Student student);

    // delete the record
    public int delete(Student student);

    //return single object
    public Student getStudent(int studentId);


    // return multiple object
    public List<Student> getAllStudent();
}
