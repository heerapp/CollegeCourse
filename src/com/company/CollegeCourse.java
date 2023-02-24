package com.company;

public class CollegeCourse {

    private String course_id;
    private int credit_hours;
    private String letter_grade;

    public CollegeCourse(String course_id, int credit_hours, String letter_grade) {
        this.course_id = course_id;
        this.credit_hours = credit_hours;
        this.letter_grade = letter_grade;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public int getCredit_hours() {
        return credit_hours;
    }

    public void setCredit_hours(int credit_hours) {
        this.credit_hours = credit_hours;
    }

    public String getLetter_grade() {
        return letter_grade;
    }

    public void setLetter_grade(String letter_grade) {
        this.letter_grade = letter_grade;
    }
}
