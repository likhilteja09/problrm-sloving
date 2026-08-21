import java.util.Scanner;

public class BankingTransactionSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (choice == 1) {
                balance += amount;
                System.out.println("Amount Deposited");
            }
            else if (choice == 2) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Amount Withdrawn");
                } else {
                    System.out.println("Insufficient Balance");
                }
            }
            else {
                System.out.println("Invalid Choice");
            }

            System.out.println("Current Balance: " + balance);
        }

        System.out.println("\nFinal Balance: " + balance);

        sc.close();
    }
}

output:
Amount Deposited
Current Balance: 12000.0

Amount Withdrawn
Current Balance: 10500.0

Amount Withdrawn
Current Balance: 7500.0

Final Balance: 7500.0
