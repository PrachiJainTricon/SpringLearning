package org.spring.jdbc.dao;


import org.spring.jdbc.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;


    public int insert(Student student) {
        String insert = "insert into student (id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(insert,student.getId(),student.getName(),student.getCity());
        return r;
    }

    @Override
    public int change(Student student) {
        String change = "update student set name=? , city=? where id=?";
        int r = this.jdbcTemplate.update(change , student.getName() ,student.getCity() ,student.getId());
        return r;
    }

    @Override
    public int delete(Student student) {
        String delete  = "delete from student where id=?";
        int r = this.jdbcTemplate.update(delete,student.getId());
        return r;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
