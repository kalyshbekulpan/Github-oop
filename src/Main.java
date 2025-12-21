public class Main {
    public static void main(String[] args) {

        Human human = new Human("Alex", 25, true);
        Employee employee = new Employee("Jake", 30, true, "Developer", 3000);
        Student student = new Student("Anna", 19, false, "AITU", 3.9f);

        System.out.println(human.getInfo());
        System.out.println(employee.getInfo());
        System.out.println(student.getInfo());

        System.out.println(Employee.company);
    }
}
