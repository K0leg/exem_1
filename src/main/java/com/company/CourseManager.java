package com.company;

class CourseManager {


    public void registerStudent(Course course, Student student) {
        if (course.addStudent(student)) {
            System.out.println(student.name + " успішно зареєстрований на курс " + course.name);
        } else {
            System.out.println("Немає місць на курсі " + course.name);
        }
    }


    public void showCourseStudents(Course course) {
        course.showStudents();
    }


    public void checkFreePlaces(Course course) {
        if (course.count < course.maxStudents) {
            System.out.println("На курсі " + course.name + " є вільні місця.");
        } else {
            System.out.println("На курсі " + course.name + " немає вільних місць.");
        }
    }
}