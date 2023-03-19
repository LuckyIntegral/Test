package com.google.persistence.dao.impl;

import com.google.persistence.config.JdbcConfig;
import com.google.persistence.dao.DepartmentDao;
import com.google.persistence.entity.Department;

import java.util.List;
import java.util.Optional;

public class DepartmentDaoImpl implements DepartmentDao {
    private JdbcConfig config;

    private static final String CREATE_STUDENT = "insert into departments value (default, ?, ?, ?);";
    private static final String UPDATE_STUDENT = "update departments set department_type = ?, updated_time = ? where id = ?;";
    private static final String DELETE_STUDENT = "delete from departments where id = ?";
    private static final String FIND_STUDENT_BY_ID = "select * from departments where id = ";
    private static final String FIND_ALL = "select * from departments";
    @Override
    public void create(Department entity) {

    }

    @Override
    public void upgrade(Department entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Department> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
