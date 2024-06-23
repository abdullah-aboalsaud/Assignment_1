package oop.season2.person;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<>();

        Teacher teacher = new Teacher("Mohammed", "Shoubra");
        Student student = new Student("Ali", "Cairo");

        person.add(teacher);
        person.add(student);

        teacher.addCourse("android");
        teacher.addCourse("Java");
        teacher.addCourse("C++");
        teacher.addCourse("HTML");
        teacher.addCourse("Web");
        teacher.addCourse("IOS");
        teacher.removeCourse("C++");

        System.out.println(person);

        student.courses.add("android");
        student.addCourseGrade("android", 55.2);
        student.printGrades();



    }
}
