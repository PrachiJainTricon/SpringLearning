package org.spring.jdbc.dao;

import org.spring.jdbc.entity.Student;

public interface StudentDao {
    public int insert(Student student);
    // to update the record
    public int change(Student student);

    // delete the record
    public int delete(Student student);
}
