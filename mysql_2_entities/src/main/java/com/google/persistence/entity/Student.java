package com.google.persistence.entity;

public class Student extends BaseEntity {
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", created=" + getCreated() +
                ", updated=" + getUpdated() +
                ", firstName='" + firstName +
                ", lastName='" + lastName +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
