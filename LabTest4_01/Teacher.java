package LabTest4_01;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Teacher information:\nName: %s\nSubject: %s\n", this.getName(), this.subject);
    }
}