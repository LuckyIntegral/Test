package ua.aom.alevel;

import ua.aom.alevel.config.HibernateConfig;
import ua.aom.alevel.dao.CourseDao;
import ua.aom.alevel.dao.StudentDao;
import ua.aom.alevel.dao.impl.CourseDaoImpl;
import ua.aom.alevel.dao.impl.StudentDaoImpl;
import ua.aom.alevel.dto.CourseDto;
import ua.aom.alevel.entity.Course;
import ua.aom.alevel.entity.Student;
import ua.aom.alevel.type.CoursesType;

import java.util.*;

public class Main {

    private final static CourseDao cd = new CourseDaoImpl();
    private final static StudentDao sd = new StudentDaoImpl();
    public static void main(String[] args) {
        HibernateConfig config = HibernateConfig.getInstance();
        start();
//        for (Student student : sd.findAll()) {
//            System.out.println("student = " + student);
//        }
//        for (Course course : cd.findAll()) {
//            System.out.println("course = " + course);
//        }

    }

    public static void start() {
                createCourse();
                createStudent();
//        attachStudentToCourse(1L, 2L);
//        removeStudent(2L);
//        removeCourse(3L);
        realtions();
        findDto();
    }

    public static void realtions() {
        for (long i = 1; i < 4; i++) {
            for (long j = i; j < 5; j++) {
                attachStudentToCourse(i, j);
            }
        }
    }

    public static void findDto() {
        List<CourseDto> dto = cd.findCourseDto();
            System.out.println("Works");
        for (CourseDto courseDto : dto) {
            System.out.println(courseDto.course().getType());
            System.out.println(courseDto.number());
        }
    }

    private static void attachStudentToCourse(Long courseId, Long studId) {
         Course course = cd.findById(courseId).get();
         Set<Student> studentsSet = course.getStudentSet();
         Student student1 = sd.findById(studId).get();
         studentsSet.add(student1);
         cd.update(course);
    }

    private static void removeStudentFromCourse(Long courseId, Long studId) {
         Course course = cd.findById(courseId).get();
         Set<Student> studentsSet = course.getStudentSet();
         Student student1 = sd.findById(studId).get();
         studentsSet.remove(student1);
         cd.update(course);
    }

    private static void createCourse() {
        for (int i = 0; i < 5; i++) {
            cd.create(randomCourse());
        }
    }

    private static void createStudent() {
        for (int i = 0; i < 5; i++) {
            sd.create(randomStudent());
        }
    }

    private static void removeStudent(Long id) {
        sd.delete(sd.findById(id).get());
    }

    private static void removeCourse(Long id) {
        cd.delete(cd.findById(id).get());
    }

//    private void deleteEmployee() {
//        Department department = departmentDao.findById(2L).get();
//        Employee employee1 = employeeDao.findById(1L).get();
//        Set<Employee> employees = department.getEmployees();
//        employees.remove(employee1);
//        departmentDao.update(department);
//        employeeDao.delete(employee1);
//    }

    private static Student randomStudent() {
        Random random = new Random();
        Student student1 = new Student();
        student1.setName("Name" + random.nextDouble(2, 5));
        student1.setEmail("Email" + random.nextDouble(3, 7));
        student1.setAge(random.nextInt(100));
        return student1;
    }

    private static Course randomCourse() {
        Random random = new Random();
        Course course2 = new Course();
        course2.setType(CoursesType.values()[random.nextInt(3)]);
        return course2;
    }
}