import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents;
        try {
            numStudents = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a integer number.");
            scanner.close();
            return;
        }

        System.out.println();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Entering information for student " + (i + 1) + ":\nName: ");
            String name = scanner.next();

            System.out.print("Student ID: ");
            String studentId = scanner.next();

            System.out.print("GPA: ");
            double gpa;
            try {
                gpa = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a float number.");
                scanner.close();
                return;
            }

            students[i] = new Student(name, studentId, gpa);

            System.out.println();
        }

        scanner.close();

        System.out.println("All student information: ");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}