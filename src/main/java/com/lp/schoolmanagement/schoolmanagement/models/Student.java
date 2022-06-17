package com.lp.schoolmanagement.schoolmanagement.models;

import java.util.Date;

public class Student {
    private Course enrolledCourse;

    private String name;

    private Date birthday;

    private float maximumWorkload;

    public Student(Course enrolledCourse, String name, Date birthday, float maximumWorkload) {
        this.enrolledCourse = enrolledCourse;
        this.name = name;
        this.birthday = birthday;
        this.maximumWorkload = maximumWorkload;
    }
}
