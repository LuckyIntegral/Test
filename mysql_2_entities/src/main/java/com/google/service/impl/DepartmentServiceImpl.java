package com.google.service.impl;

import com.google.persistence.dao.DepartmentDao;
import com.google.persistence.dao.impl.DepartmentDaoImpl;
import com.google.persistence.entity.Department;
import com.google.service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao = new DepartmentDaoImpl();
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
    public Department findById(Long id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
