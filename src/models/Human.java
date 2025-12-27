package models;

public abstract class Human {
    protected String name;
    protected int age;
    protected boolean male;

    public Human(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public abstract String sayHello();

    public String getInfo() {
        return name + ", age: " + age;
    }

}
