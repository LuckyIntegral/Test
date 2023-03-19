package com.google.persistence.dao.impl;

import com.google.persistence.config.JdbcConfig;
import com.google.persistence.config.impl.JdbcConfigImpl;
import com.google.persistence.dao.StudentDao;
import com.google.persistence.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {
    private final JdbcConfig jdbcConfig = new JdbcConfigImpl();
    private static final String CREATE_STUDENT = "insert into students value (default, ?, ?, ?, ?, ?);";
    private static final String UPDATE_STUDENT = "update students set first_name = ?, last_name = ?, age = ?, updated_time = ? where id = ?;";
    private static final String DELETE_STUDENT = "delete from students where id = ?";
    private static final String FIND_STUDENT_BY_ID = "select * from students where id = ";
    private static final String FIND_ALL = "select * from students";
    private static final String FIND_STUDENTS_BY_DEPARTMENT = "select id, created_data, updated_data, first_name, last_name, age from students left join stud_dep sd on students.id = sd.stud_id where dep_id = ";
    @Override
    public void create(Student entity) {
        System.out.println(entity);
        Connection connection = jdbcConfig.getConnection();
        System.out.println("connection = " + connection);
    }

    @Override
    public void upgrade(Student entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public List<Student> findStudentsByDepartment(Long id) {
        List<Student> students = new ArrayList<>();
        try (ResultSet resultSet = jdbcConfig.getStatement().executeQuery(FIND_STUDENTS_BY_DEPARTMENT + id)) {
            while (resultSet.next()) {
                students.add(getStudentByResultSet(resultSet));
            }
            return students;
        } catch (Exception e) {
            return students;
        }
    }

    private Student getStudentByResultSet(ResultSet resultSet) throws SQLException {
        Long id = resultSet.getLong("id");
        Timestamp created = resultSet.getTimestamp("created_data");
        Timestamp updated = resultSet.getTimestamp("updated_data");
        String name = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        int age = resultSet.getInt("age");
        Student student = new Student();
        student.setId(id);
        student.setCreated(created);
        student.setUpdated(updated);
        student.setFirstName(name);
        student.setLastName(lastName);
        student.setAge(age);
        return student;
    }
}
