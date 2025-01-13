package LabTest4_01;

public class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Student information:\nName: %s\nStudent ID: %s\n", this.getName(), this.studentId);
    }
}