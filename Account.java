import java.util.ArrayList;

public class Account {
    private String name;
    private int pin;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited ₹" + amount);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add("Withdrew ₹" + amount);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }
}
