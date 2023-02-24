package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] students = new Student[1];

        // Prompt the professor to enter data for each student and course
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Enter ID for student #%d: ", i + 1);
            int student_id = input.nextInt();
            students[i] = new Student(student_id);

            for (int j = 0; j < 5; j++) {
                System.out.printf("Enter course ID #%d for student #%d: ", j + 1, i + 1);
                String course_id = input.next();
                System.out.printf("Enter credit hours for course #%d: ", j + 1);
                int credit_hours = input.nextInt();
                System.out.printf("Enter grade for course #%d (A, B, C, D, or F): ", j + 1);
                String letter_grade = input.next();

                // Verify that the professor enters only A, B, C, D, or F for the grade value
                while (!letter_grade.equals("A") && !letter_grade.equals("B") && !letter_grade.equals("C") && !letter_grade.equals("D") && !letter_grade.equals("F")) {
                    System.out.print("Invalid grade value. Please enter A, B, C, D, or F: ");
                    letter_grade = input.next();
                }

                CollegeCourse course = new CollegeCourse(course_id, credit_hours, letter_grade);
                students[i].setCourse(course, j);
            }
        }

        // Display the information in order by student then course
        for (Student student : students) {
            System.out.printf("Student #%d  ID #%d\n", findStudentIndex(students, student) + 1, student.getStudent_id());

            for (int i = 0; i < 5; i++) {
                CollegeCourse course = student.getCourse(i);
                System.out.printf("%s %d  -- credits. Grade is %s\n", course.getCourse_id(), course.getCredit_hours(), course.getLetter_grade());
            }
        }
    }

    private static int findStudentIndex(Student[] students, Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                return i;
            }
        }

        return -1;
    }
}
