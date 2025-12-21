public class Student extends Human {

    private String university;
    private float gpa;

    public Student(String name, int age, boolean male,
                   String university, float gpa) {
        super(name, age, male);
        this.university = university;
        this.gpa = gpa;
    }

    @Override
    public String getInfo() {
        return "Student: " + getName() + ", " + university;
    }
}
