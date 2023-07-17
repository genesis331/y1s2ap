package zixucheah331;

public class Account {
    private String accNum;
    private double balance;

    Account(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }
}
