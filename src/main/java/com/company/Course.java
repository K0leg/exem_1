package com.company;

class Course {
    String name;
    String teacher;
    int maxStudents;
    Student[] students;
    int count = 0;

    // Конструктор
    public Course(String name, String teacher, int maxStudents) {
        this.name = name;
        this.teacher = teacher;
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
    }

    // Додати студента
    public boolean addStudent(Student student) {
        if (count < maxStudents) {
            students[count] = student;
            count++;
            return true;
        }
        return false;
    }


    public void showStudents() {
        System.out.println("Курс: " + name + " (Викладач: " + teacher + ")");
        if (count == 0) {
            System.out.println("Немає зареєстрованих студентів.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + students[i].name);
            }
        }
    }
}