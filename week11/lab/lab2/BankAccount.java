package week11.lab.lab2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        } else {
            this.balance += amount;
        }

        System.out.printf("Deposited: %.1f, New Balance: %.1f\n", amount, this.balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be greater than zero.");
        } else if (amount > this.balance) {
            throw new InsufficientFundsException(amount, this.balance);
        } else {
            this.balance -= amount;
        }

        System.out.printf("Withdrawn: %.1f, Remaining Balance: %.1f\n", amount, this.balance);
    }
}
