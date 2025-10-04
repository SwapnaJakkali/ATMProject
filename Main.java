import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMFunctions atm = new ATMFunctions();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ATM Machine =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 5) {
                System.out.println("Thank you for using the ATM!");
                break;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance(name, pin);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    atm.deposit(name, pin, dep);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    atm.withdraw(name, pin, wit);
                    break;
                case 4:
                    atm.transactionHistory(name, pin);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
