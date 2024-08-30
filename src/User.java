public class User {
    private String name;
    private String address;
    private String mobileNumber;
    private double annualIncome;
    private FinanceTracker financeTracker;

    public User(String name, String address, String mobileNumber, double annualIncome) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.annualIncome = annualIncome;
        this.financeTracker = new FinanceTracker();
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public FinanceTracker getFinanceTracker() {
        return financeTracker;
    }

    @Override
    public String toString() {
        return "User: " + name + "\nAddress: " + address + "\nMobile Number: " + mobileNumber + "\nAnnual Income: "
                + annualIncome;
    }
}
