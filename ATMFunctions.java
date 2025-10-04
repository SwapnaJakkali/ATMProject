import java.util.ArrayList;

public class ATMFunctions {
    private ArrayList<Account> accounts;

    public ATMFunctions() {
        accounts = new ArrayList<>();

        accounts.add(new Account("Ravi", 1234, 5000));
        accounts.add(new Account("Priya", 2345, 7000));
        accounts.add(new Account("Suresh", 3456, 10000));
        accounts.add(new Account("Anita", 4567, 3000));
        accounts.add(new Account("Kiran", 5678, 8500));
        accounts.add(new Account("Meena", 6789, 12000));
        accounts.add(new Account("Vamsi", 7890, 4500));
        accounts.add(new Account("Rohit", 8901, 6000));
        accounts.add(new Account("Sonia", 9012, 9000));
        accounts.add(new Account("Neha", 1122, 11000));
    }

    // find account by name and pin
    private Account findAccount(String name, int pin) {
        for (Account acc : accounts) {
            if (acc.getName().equalsIgnoreCase(name) && acc.getPin() == pin) {
                return acc;
            }
        }
        return null;
    }

    // checkbalance by name and pin
    public void checkBalance(String name, int pin) {
        Account acc = findAccount(name, pin);
        if (acc != null) {
            System.out.println("Current balance:" + acc.getBalance());
        } else {
            System.out.println("Invalid Name or PIN!");
        }
    }

    // deposit money
    public void deposit(String name, int pin, double amount) {
        Account acc = findAccount(name, pin);
        if (acc != null) {
            acc.deposit(amount);
            System.out.println("Deposit successful! New balance: " + acc.getBalance());
        } else {
            System.out.println("Invalid Name or PIN!");
        }
    }

    // withdraw
    public void withdraw(String name, int pin, double amount) {
        Account acc = findAccount(name, pin);
        if (acc != null) {
            if (acc.withdraw(amount)) {
                System.out.println("Withdrawal successful! Remaining balance: " + acc.getBalance());
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid Name or PIN!");
        }
    }

    //transaction history
    public void transactionHistory(String name, int pin) {
        Account acc = findAccount(name, pin);
        if (acc != null) {
            System.out.println("\nTransaction History for " + acc.getName() + ":");
            if (acc.getTransactions().isEmpty()) {
                System.out.println("No transactions yet.");
            } else {
                for (String t : acc.getTransactions()) {
                    System.out.println(t);
                }
            }
        } else {
            System.out.println("Invalid Name or PIN!");
        }
    }
}