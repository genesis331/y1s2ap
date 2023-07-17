package zixucheah331;

public class Savings extends Account {
    private double yearlyRate;
    private boolean awaitingDecision = false;

    Savings(String accNum, double balance, double yearlyRate) {
        super(accNum, balance);
        this.yearlyRate = yearlyRate;
    }

    Savings(String accNum, double balance, boolean awaitingDecision) {
        super(accNum, balance);
        this.awaitingDecision = awaitingDecision;
    }

    public double getYearlyRate() {
        return yearlyRate;
    }

    public void addInterest() {
        if (!awaitingDecision) {
            deposit(getBalance() * (1 + yearlyRate));
        }
    }

    public void displayAcc() {
        if (!awaitingDecision) {
            System.out.println("Savings " + getAccNum() + ": " + getBalance() + " (Rate: " + getYearlyRate() + ")");
        } else {
            System.out.println("Savings " + getAccNum() + ": " + getBalance() + " (Awaiting decision)");
        }
    }
}
