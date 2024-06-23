package oop.season2.person;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> courses;

    public Teacher(String name, String adress) {
        super(name, adress);
        courses = new ArrayList<>();
    }
    public boolean addCourse(String courseName) {
        if (courses.size()==10) {
            System.out.println("Sorry, You can't add more courses cause you've reached maximum capacity");
            return false;
        }
        for (int i = 0; i < courses.size(); i++) {
            if (courseName.equals(courses.get(i))) {
                System.out.println("This course is already exist.");
                return false;
            }
        }
        courses.add(courseName);
        return true;
    }

    public boolean removeCourse(String courseName) {
        int index = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courseName.equals(courses.get(i))) {
                index = i;
                courses.remove(index);
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        return true;
    }

    public void printCourses(){
        for (int i =0; i<courses.size(); i++){
            System.out.println(courses.get(i));
        }
        System.out.println("Number of courses is: " + courses.size());
    }
}
