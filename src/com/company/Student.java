package com.company;

public class Student {

    private int student_id;
    private CollegeCourse[] courses = new CollegeCourse[5];

    public Student(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public CollegeCourse getCourse(int index) {
        return courses[index];
    }

    public void setCourse(CollegeCourse course, int index) {
        courses[index] = course;
    }
}
