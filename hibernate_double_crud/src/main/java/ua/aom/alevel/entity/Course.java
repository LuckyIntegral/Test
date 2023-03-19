package ua.aom.alevel.entity;

import jakarta.persistence.*;
import ua.aom.alevel.type.CoursesType;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "courses_type")
    private CoursesType type;
    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "stud_course",
            joinColumns = @JoinColumn(name = "couse_id"),
            inverseJoinColumns = @JoinColumn(name = "stud_id")
    )
    private Set<Student> studentSet;
    public Course() {
        super();
        studentSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + getId() +
                ", created=" + getCreated().toString() +
                ", type=" + type +
                ", studentSet=" + studentSet +
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

    public CoursesType getType() {
        return type;
    }

    public void setType(CoursesType type) {
        this.type = type;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
