package com.lp.schoolmanagement.schoolmanagement.models;

import java.util.Date;

public class Class {
    private Subject subject;

    private String[] schedules;

    private Date startDate;

    private Date endDate;

    private Teacher teacher;

    public Class(Subject subject, String[] schedules, Date startDate, Date endDate, Teacher teacher) {
        this.subject = subject;
        this.schedules = schedules;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacher = teacher;
    }
}
