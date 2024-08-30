public class Transaction {
    private String type; // "Income" or "Expense"
    private double amount;
    private String description;
    private String date;

    public Transaction(String type, double amount, String description, String date) {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date + " - " + type + ": " + amount + " (" + description + ")";
    }
}
