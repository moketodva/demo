package com.test.annotation.IOC;

/**
 * @author moke
 */
public class Student {

    private String name;

    private School school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}
