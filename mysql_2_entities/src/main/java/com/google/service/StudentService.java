package com.google.service;

import com.google.persistence.entity.Student;

import java.util.List;

public interface StudentService extends BaseService<Student> {
    List<Student> findStudentsByDepartment(Long id);
}
