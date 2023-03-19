package ua.aom.alevel.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {
    @Column()
    private String name;
    @Column()
    private String email;
    @Column()
    private Integer age;
    @ManyToMany(mappedBy = "studentSet", cascade = CascadeType.REFRESH)
    private Set<Course> courseSet;
    public Student() {
        super();
        courseSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", created=" + getCreated().toString() +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }
}
