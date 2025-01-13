package week11.lab.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 2, 4, 0, 8, 10 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        try {
            num1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("An exception occurred: " + e + ":\nThe input must be an integer.");
            sc.close();
            return;
        }

        System.out.print("Enter num2: ");
        try {
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("An exception occurred: " + e + ":\nThe input must be an integer.");
            sc.close();
            return;
        }

        try {
            System.out.println(arr1[num1] + " * " + arr2[num2] + " = " + arr1[num1] * arr2[num2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e + "\nThe entered number exceeds the array size.");
        }

        sc.close();
    }
}