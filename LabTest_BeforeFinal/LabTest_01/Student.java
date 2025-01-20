public class Student extends Person implements Displayable {
    private String studentId;
    private double gpa;

    public Student(String name, String studentId, double gpa) {
        super(name);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Name: %-7s | Student ID: %-5s | GPA: %.2f\n", this.getName(), studentId, gpa);
    }
}