package com.lp.schoolmanagement.schoolmanagement.models;

import java.sql.Time;

public class Course {
    private String courseName;

    private Subject[] subjects;

    public Course(String courseName, Subject[] subjects) {
        this.courseName = courseName;
        this.subjects = subjects;
    }
}
