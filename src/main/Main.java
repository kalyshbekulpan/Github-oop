package main;

import models.Human;
import models.Employee;
import models.Student;
import interfaces.IStudy;
import interfaces.IWork;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(
                "Alex", 19, true,
                "AITU", 3.9f, "ST123"
        );

        Human humanEmployee = new Employee(
                "Jake", 30, true,
                "Developer", 3000
        );

        IWork worker = new Employee(
                "Sam", 28, true,
                "Designer", 2500
        );

        IStudy learner = student;

        System.out.println(student.sayHello());
        student.study();
        student.showStudentId();

        System.out.println(humanEmployee.sayHello());

        worker.work();
        System.out.println("Salary: " + worker.getSalary());

        learner.study();
        System.out.println("GPA: " + learner.getPerformance());

        System.out.println("Company: " + Employee.company);
    }
}
