package org.example;

public class Student {
    private String student_number;
    private String name;

    public String getName() {
        return name;
    }

    public Student(){

    }
    public Student(String student_number, String name) {
        this.student_number = student_number;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_number='" + student_number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
