package org.spring.jdbc.annotation.dao;

import org.spring.jdbc.annotation.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;


    public int insert(Student student) {
        String insert = "insert into student (id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(insert,student.getId(),student.getName(),student.getCity());
        return r;
    }


    public int change(Student student) {
        String change = "update student set name=? , city=? where id=?";
        int r = this.jdbcTemplate.update(change , student.getName() ,student.getCity() ,student.getId());
        return r;
    }


    public int delete(Student student) {
        String delete  = "delete from student where id=?";
        int r = this.jdbcTemplate.update(delete,student.getId());
        return r;
    }

    public Student getStudent(int studentId) {
        String select = "select * from student where id=?";
        RowMapper rowMapper = new RowMapperImpl();
        Student student = (Student) this.jdbcTemplate.queryForObject(select ,rowMapper , studentId);
//        Student student = (Student) this.jdbcTemplate.queryForObject(select , new RowMapper() {
//
//            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
//                Student student = new Student();
//                student.setId(resultSet.getInt(1)); // getInt(column number)
//                student.setName(resultSet.getString(2));
//                student.setCity(resultSet.getString(3));
//
//                return student;
//            }
//        }, studentId);

        return student;
    }


    public List<Student> getAllStudent() {
        String query = "select * from student";
        //RowMapper rowMapper = new RowMapperImpl();
        List<Student> students =  this.jdbcTemplate.query(query ,new RowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
