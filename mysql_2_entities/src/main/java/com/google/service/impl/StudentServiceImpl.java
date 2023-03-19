package com.google.service.impl;

import com.google.persistence.dao.StudentDao;
import com.google.persistence.dao.impl.StudentDaoImpl;
import com.google.persistence.entity.Student;
import com.google.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao = new StudentDaoImpl();
    @Override
    public void create(Student entity) {
        studentDao.create(entity);
    }

    @Override
    public void upgrade(Student entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public List<Student> findStudentsByDepartment(Long id) {
        return studentDao.findStudentsByDepartment(id);
    }
}
