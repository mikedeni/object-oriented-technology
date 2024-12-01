package practies;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subjects = 0;

        while (true) {
            System.out.print("Enter the number of subjects: ");
            subjects = scanner.nextInt();

            if (subjects <= 0) {
                System.out.println("Invalid input. Please enter a number greater than 0.");
            } else {
                break;
            }
        }

        int[] gradeArray = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            while (true) {
                System.out.printf("Enter grade for subject %d: ", i + 1);
                int grade = scanner.nextInt();

                if (grade >= 0 && grade <= 100) {
                    gradeArray[i] = grade;
                    break;
                } else {
                    System.out.println("Invalid grade. Enter a grade between 0 and 100");
                }
            }
        }

        GradeCalculator gradeCalculator = new GradeCalculator();

        double avg = gradeCalculator.calculateAverage(gradeArray);
        char grade = gradeCalculator.calculateGrade(avg);

        System.out.printf("Your average grade is: %.2f\n", avg);
        System.out.println("Your assigned grade is: " + grade);

        scanner.close();
    }

    public double calculateAverage(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return (double) total / numbers.length;
    }

    public double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public char calculateGrade(double avg) {
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
