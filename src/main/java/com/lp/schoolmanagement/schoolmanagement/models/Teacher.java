package com.lp.schoolmanagement.schoolmanagement.models;

public class Teacher {
    private Subject[] allowedSubjects;

    private float maximumWeeklyHours;
    private String name;

    public Teacher(Subject[] allowedSubjects, float maximumWeeklyHours, String name) {
        this.allowedSubjects = allowedSubjects;
        this.maximumWeeklyHours = maximumWeeklyHours;
        this.name = name;
    }
}
