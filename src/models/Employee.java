package models;

import interfaces.IStudy;
import interfaces.IWork;

public class Employee extends Human implements IWork, IStudy {

    private String position;
    private float salary;
    public static String company = "TechCorp";

    public Employee(String name, int age, boolean male,
                    String position, float salary) {
        super(name, age, male);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String sayHello() { return "Hello, I am an employee"; }

    @Override
    public void work() { System.out.println(name + " is working as " + position); }

    @Override
    public float getSalary() { return salary; }

    @Override
    public void study() { System.out.println(name + " studies while working"); }

    @Override
    public float getPerformance() { return 75.5f; }
}
