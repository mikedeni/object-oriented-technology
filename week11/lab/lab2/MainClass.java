package week11.lab.lab2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);

        double amount;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        amount = scanner.nextDouble();
                        account.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        amount = scanner.nextDouble();
                        account.withdraw(amount);
                        break;
                    case 3:
                        System.out.printf("Current Balance: %.1f\n", account.getBalance());
                        break;
                    case 4:
                        scanner.close();
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
