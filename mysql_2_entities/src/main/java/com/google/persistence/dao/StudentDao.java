package com.google.persistence.dao;

import com.google.persistence.entity.Student;

import java.util.List;

public interface StudentDao extends BaseDao<Student> {
    List<Student> findStudentsByDepartment(Long id);
}
