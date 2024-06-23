package oop.season2.person;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> courses;
    ArrayList<Double> grades;

    public Student(String name, String adress) {
        super(name, adress);
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }
    public void addCourseGrade(String courseName, double grade) {
        if (courseName == null) {
            throw new NullPointerException("courseName cannot be null");
        }
        if (courses == null || grades == null) {
            throw new NullPointerException("courses and grades lists cannot be null");
        }
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equalsIgnoreCase(courseName)) {
                grades.set(i, grade);
                return;
            }
        }
        courses.add(courseName);
        grades.add(grade);
    }

    public void printGrades(){
        for (int i =0 ; i<courses.size(); i++){
            System.out.println("Course name: " +courses.get(i) +"  Grade: " + grades.get(i));
        }
    }
}
