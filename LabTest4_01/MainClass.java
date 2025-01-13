package LabTest4_01;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your student information:\nName: ");
        String studentName = scanner.nextLine();
        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();

        System.out.println();

        System.out.print("Please enter your teacher information:\nName: ");
        String teacherName = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        scanner.close();

        System.out.println();

        Student student = new Student(studentName, studentId);
        Teacher teacher = new Teacher(teacherName, subject);

        student.displayInfo();

        System.out.println();

        teacher.displayInfo();
    }
}