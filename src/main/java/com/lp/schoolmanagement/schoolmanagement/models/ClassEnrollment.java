package com.lp.schoolmanagement.schoolmanagement.models;

public class ClassEnrollment {
    private Class enrolledClass;

    private Student student;

    // Possible status: ONGOING, APPROVED, REPROVED
    private String status;

    public ClassEnrollment(Class enrolledClass, Student student, String status) {
        this.enrolledClass = enrolledClass;
        this.student = student;
        this.status = status;
    }
}
