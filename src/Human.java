public class Human {

    private String name;
    private int age;
    private boolean male;

    public Human(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String sayHello() {
        return "Hello";
    }

    public String getInfo() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }
}
