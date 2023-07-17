package zixucheah331;

public class Current extends Account {
    private double overdraftLimit;

    Current(String accNum, double balance, double overdraftLimit) {
        super(accNum, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount > getBalance() + overdraftLimit) {
            System.out.println("Insufficient funds");
        } else {
            super.withdraw(getBalance() - amount);
        }
    }

    public void displayAcc() {
        System.out.println("Current " + getAccNum() + ": " + getBalance() + " (Limit: " + getOverdraftLimit() + ")");
    }
}
