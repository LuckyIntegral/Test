package com.google.controller.impl;

import com.google.controller.CrudController;
import com.google.persistence.entity.Student;
import com.google.service.DepartmentService;
import com.google.service.StudentService;
import com.google.service.impl.DepartmentServiceImpl;
import com.google.service.impl.StudentServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrudControllerImpl implements CrudController {
    private final StudentService studentService = new StudentServiceImpl();
    private final DepartmentService departmentService = new DepartmentServiceImpl();
    @Override
    public void start() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Select your option");
            String option;
            menu();
            while ((option = reader.readLine()) != null) {
                crud(reader, option);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void crud(BufferedReader reader, String select) throws IOException {
        switch (select) {
            case "1" -> createStudent(reader);
            case "2" -> findByIdStudent(reader);
            case "3" -> findAllStudent();
            case "4" -> updateStudent(reader);
            case "5" -> deleteStudent(reader);
            case "6" -> findStudentsByDepartmentId(reader);
            case "7" -> createDepartment(reader);
            case "8" -> findByIdDepartment(reader);
            case "9" -> findAllDepartment();
            case "10" -> updateDepartment(reader);
            case "11" -> deleteDepartment(reader);
            case "12" -> stop();
        }
        menu();
    }

    private void findStudentsByDepartmentId(BufferedReader reader) {
        System.out.println("Enter department id");
        try {
            Long id = Long.parseLong(reader.readLine());
            for (Student student : studentService.findStudentsByDepartment(id)) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deleteDepartment(BufferedReader reader) {

    }

    private void updateDepartment(BufferedReader reader) {
    }

    private void findAllDepartment() {
    }

    private void findByIdDepartment(BufferedReader reader) {
    }

    private void createDepartment(BufferedReader reader) {
    }

    private void deleteStudent(BufferedReader reader) {
    }

    private void updateStudent(BufferedReader reader) {
    }

    private void findAllStudent() {
    }

    private void findByIdStudent(BufferedReader reader) {
    }

    private void createStudent(BufferedReader reader) {
        studentService.create(new Student());
    }

    private void stop() {
        System.exit(0);
    }

    private void menu() {
        System.out.println();
        System.out.println("If you want to create a student, please enter ------ 1");
        System.out.println("If you want to find the student, please enter ------ 2");
        System.out.println("If you want to find all students, please enter ----- 3");
        System.out.println("If you want to update the student, please enter ---- 4");
        System.out.println("If you want to delete the student, please enter ---- 5");
        System.out.println("If you want to find students by department, enter -- 6");
        System.out.println("If you want to create a department, please enter --- 7");
        System.out.println("If you want to find the department, please enter --- 8");
        System.out.println("If you want to find all department, please enter --- 9");
        System.out.println("If you want to update the department, please enter - 10");
        System.out.println("If you want to delete the department, please enter - 11");
        System.out.println("If you want to close application, please enter ----- 12");
        System.out.println();
    }
}
