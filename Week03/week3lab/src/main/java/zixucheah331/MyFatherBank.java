package zixucheah331;

public class MyFatherBank {
    static Savings sAcc1 = new Savings("010001", 2000.00, 0.06);
    static Savings sAcc2 = new Savings("010002", 5000.00, 0.03);
    static Current cAcc1 = new Current("020001", 4000.00, 5000.00);
    static Current cAcc2 = new Current("020002", 10000.00, 8000.00);
    static Savings sAcc3 = new Savings("010003", 1000.00, true);
    static PowerSaving pAcc1 = new PowerSaving("030001", 2200.00, 0.05, 3000.00);
    static PowerSaving pAcc2 = new PowerSaving("030002", 1900.00, 0.04, 2000.00);

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        sAcc1.displayAcc();
        sAcc2.displayAcc();
        cAcc1.displayAcc();
        cAcc2.displayAcc();
        sAcc3.displayAcc();
        sAcc1.deposit(200.00);
        cAcc1.deposit(100.00);
        sAcc1.withdraw(4000.00);
        cAcc1.withdraw(200.00);
        sAcc2.withdraw(12000.00);
        cAcc1.withdraw(12000.00);
        cAcc2.withdraw(12000.00);
        sAcc1.addInterest();
        sAcc2.addInterest();
        sAcc3.addInterest();
        pAcc1.displayAcc();
        pAcc2.displayAcc();
        pAcc2.deposit(100.00);
        pAcc1.withdraw(5000.00);
        pAcc2.withdraw(5000.00);
        System.out.println("--------------------------------------------------------------------");
        sAcc1.displayAcc();
        sAcc2.displayAcc();
        cAcc1.displayAcc();
        cAcc2.displayAcc();
        sAcc3.displayAcc();
        pAcc1.displayAcc();
        pAcc2.displayAcc();
        System.out.println("--------------------------------------------------------------------");
    }
}