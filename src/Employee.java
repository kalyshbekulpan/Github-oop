public class Employee extends Human {

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
    public String getInfo() {
        return "Employee: " + getName() + ", " + position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
