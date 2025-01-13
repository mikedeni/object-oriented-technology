package week11.lab.lab2;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double amount, double balance) {
        super("Insufficient funds: Requested " + amount + ", Available " + balance);
    }
}
