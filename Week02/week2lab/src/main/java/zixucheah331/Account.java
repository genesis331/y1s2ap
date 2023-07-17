package zixucheah331;

public class Account {
    private String accNo;
    private double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() { return accNo; }

    public double getBalance() {
        return balance;
    }

    public void deductServiceFee() {
        balance -= 10.00;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }
}
