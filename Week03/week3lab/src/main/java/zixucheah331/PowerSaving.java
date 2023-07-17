package zixucheah331;

public class PowerSaving extends Savings {
    private double eotl;

    PowerSaving(String accNum, double balance, double yearlyRate, double eotl) {
        super(accNum, balance, yearlyRate);
        this.eotl = eotl;
    }

    public double getEotl() {
        return eotl;
    }

    public void setEotl(double eotl) {
        this.eotl = eotl;
    }

    public void displayAcc() {
        System.out.println("PowerSaving " + getAccNum() + ": " + getBalance() + " (Rate: " + getYearlyRate() + ", EOTL: " + getEotl() + ")");
    }

    public void withdraw(double amount) {
        double balance = getBalance();
        if (amount > balance) {
            if (amount > balance + eotl) {
                System.out.println("Insufficient funds");
            } else {
                super.withdraw(balance);
                setEotl(getEotl() - (amount - balance));
            }
        } else {
            super.withdraw(amount);
        }
    }
}
