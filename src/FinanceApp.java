import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinanceApp {
    private static List<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Create New User");
            System.out.println("2. Select Existing User");
            System.out.println("3. Quit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    selectExistingUser();
                    break;
                case 3:
                    System.out.println("Quitting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createUser() {
        String name;
        do {
            System.out.println("Enter Name (no digits allowed):");
            name = scanner.nextLine();
            if (!name.matches("[a-zA-Z\\s]+")) {
                System.out.println("Invalid name. Only letters and spaces are allowed.");
            }
        } while (!name.matches("[a-zA-Z\\s]+"));

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        String mobileNumber;
        do {
            System.out.println("Enter Mobile Number (10 digits):");
            mobileNumber = scanner.nextLine();
            if (!mobileNumber.matches("\\d{10}")) {
                System.out.println("Invalid mobile number. It must be exactly 10 digits.");
            }
        } while (!mobileNumber.matches("\\d{10}"));

        double income;
        do {
            System.out.println("Enter Annual Income (0 or greater):");
            income = scanner.nextDouble();
            if (income < 0) {
                System.out.println("Invalid income. It must be 0 or greater.");
            }
        } while (income < 0);
        scanner.nextLine(); // Consume newline

        User user = new User(name, address, mobileNumber, income);
        user.getFinanceTracker().addTransaction("Income", income, "Initial Income", "Start Date");
        users.add(user);

        System.out.println("User created successfully!");
    }

    private static void selectExistingUser() {
        if (users.isEmpty()) {
            System.out.println("No existing user.");
            return;
        }

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Mobile Number:");
        String mobileNumber = scanner.nextLine();

        for (User user : users) {
            if (user.getName().equals(name) && user.getMobileNumber().equals(mobileNumber)) {
                manageUser(user);
                return;
            }
        }

        System.out.println("User not found. Please check your name and mobile number.");
    }

    private static void manageUser(User user) {
        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Go Back");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addExpense(user);
                    break;
                case 2:
                    user.getFinanceTracker().viewTransactions();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addExpense(User user) {
        System.out.println("Enter Expense Amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter Expense Description:");
        String description = scanner.nextLine();

        String date;
        do {
            System.out.println("Enter Expense Date (YYYY-MM-DD):");
            date = scanner.nextLine();
            if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
                System.out.println("Invalid date format. It must be in YYYY-MM-DD format.");
            }
        } while (!date.matches("\\d{4}-\\d{2}-\\d{2}"));

        user.getFinanceTracker().addTransaction("Expense", amount, description, date);
        System.out.println("Expense added successfully!");
    }
}
