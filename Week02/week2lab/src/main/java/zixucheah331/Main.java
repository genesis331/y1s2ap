package zixucheah331;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("121515", 6000.00);
        Account account2 = new Account("038989", 1500.00);
        System.out.println("Account " + account1.getAccNo() + " has a balance of " + String.format("%.2f", account1.getBalance()));
        System.out.println("Account " + account2.getAccNo() + " has a balance of " + String.format("%.2f", account2.getBalance()));
        account1.deductServiceFee();
        account2.deductServiceFee();
        System.out.println("Account " + account1.getAccNo() + " now has a balance of " + String.format("%.2f", account1.getBalance()));
        System.out.println("Account " + account2.getAccNo() + " now has a balance of " + String.format("%.2f", account2.getBalance()));
        account1.deposit(500.00);
        account2.withdraw(99.00);
        System.out.println("Account " + account1.getAccNo() + " now has a new balance of " + String.format("%.2f", account1.getBalance()));
        System.out.println("Account " + account2.getAccNo() + " now has a new balance of " + String.format("%.2f", account2.getBalance()));
    }
}
