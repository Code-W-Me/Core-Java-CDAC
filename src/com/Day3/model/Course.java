package com.Day3.model;

public class Course {

    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}