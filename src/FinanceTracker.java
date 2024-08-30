import java.util.ArrayList;
import java.util.List;

public class FinanceTracker {
    private List<Transaction> transactions;

    public FinanceTracker() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String type, double amount, String description, String date) {
        transactions.add(new Transaction(type, amount, description, date));
    }

    public double calculateBalance() {
        double balance = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("Income")) {
                balance += t.getAmount();
            } else {
                balance -= t.getAmount();
            }
        }
        return balance;
    }

    public void viewTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
