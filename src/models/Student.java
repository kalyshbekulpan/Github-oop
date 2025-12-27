package models;

import interfaces.IStudy;

public final class Student extends Human implements IStudy {

    private String university;
    private float gpa;
    public final String studentId;

    public Student(String name, int age, boolean male,
                   String university, float gpa, String studentId) {
        super(name, age, male);
        this.university = university;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    @Override
    public String sayHello() { return "Hello, I am a student"; }

    @Override
    public void study() { System.out.println(name + " studies at " + university); }

    @Override
    public float getPerformance() { return gpa; }

    public final void showStudentId() { System.out.println("Student ID: " + studentId); }
}
