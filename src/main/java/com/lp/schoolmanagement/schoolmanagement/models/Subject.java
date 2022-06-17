package com.lp.schoolmanagement.schoolmanagement.models;

public class Subject {
    private float workload;

    private Subject[] prerequisites;

    private String program;

    public Subject(float workload, Subject[] prerequisites, String program) {
        this.workload = workload;
        this.prerequisites = prerequisites;
        this.program = program;
    }
}
