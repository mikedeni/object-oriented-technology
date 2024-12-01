package midterm.week05.lecture;

// Problem: get user input 1-7 and return day using static getDay()

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int num = scanner.nextInt();

        String result = getDay(num);

        System.out.printf("The day corresponding to %d is: %s", num, result);

        scanner.close();
    }

    static String getDay(int num) {
        if (num < 1 || num > 7) {
            return "Invalid.";
        }

        String[] days = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };

        return days[num - 1];
    }
}