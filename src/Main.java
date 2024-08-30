import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FinanceTracker tracker = new FinanceTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter description: ");
                String description = scanner.nextLine();
                System.out.print("Enter date (YYYY-MM-DD): ");
                String date = scanner.nextLine();

                tracker.addTransaction("Income", amount, description, date);
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter description: ");
                String description = scanner.nextLine();
                System.out.print("Enter date (YYYY-MM-DD): ");
                String date = scanner.nextLine();

                tracker.addTransaction("Expense", amount, description, date);
            } else if (choice == 3) {
                System.out.println("Current Balance: " + tracker.calculateBalance());
            } else if (choice == 4) {
                tracker.viewTransactions();
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
