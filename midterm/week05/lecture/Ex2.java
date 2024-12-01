package midterm.week05.lecture;

// Problem: get int input from user and return abs value using not static getAbsValue()

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();

        Ex2 ex2 = new Ex2();

        int result = ex2.getAbsValue(num);

        System.out.printf("The absolute value of %d is: %d", num, result);

        scanner.close();
    }

    public int getAbsValue(int num) {
        return Math.abs(num);
    }
}
