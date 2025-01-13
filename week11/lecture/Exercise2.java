package week11.lecture;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter your student ID: ");
            String studentId = scanner.nextLine();

            System.out.print("Please enter your name: ");
            String fullName = scanner.nextLine();

            if (studentId.length() != 8) {
                throw new StudentIDFormatException("ID length is not 8");
            }

            if (!Character.isLetter(studentId.charAt(0)) || !Character.isUpperCase(studentId.charAt(0))) {
                throw new StudentIDFormatException("ID format not start with letter");
            }

            for (int i = 1; i < studentId.length(); i++) {
                if (!Character.isDigit(studentId.charAt(i))) {
                    throw new StudentIDFormatException("ID number format is incorrect");
                }
            }

            // ทำ firstName lastName ต่อ...

        } catch (StudentIDFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
