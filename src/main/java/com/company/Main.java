package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Андрій");
        Student student2 = new Student("Олена");
        Student student3 = new Student("Марія");


        Course math = new Course("Математика", "Гаврилович", 2);


        CourseManager courseManager = new CourseManager();


        courseManager.registerStudent(math, student1);
        courseManager.registerStudent(math, student2);
        courseManager.registerStudent(math, student3);


        courseManager.checkFreePlaces(math);


        courseManager.showCourseStudents(math);
    }
}