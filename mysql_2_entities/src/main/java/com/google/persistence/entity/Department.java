package com.google.persistence.entity;

import com.google.persistence.type.DepartmentType;

public class Department extends BaseEntity {
    private DepartmentType departmentType;

    public Department() {
        super();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + getId() +
                ", created=" + getCreated() +
                ", updated=" + getUpdated() +
                ", departmentType=" + departmentType +
                '}';
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }
}
