package Homeworks.HW3;

public class SavingsAccount extends BankAccount {

    @Override
    public boolean debit(int pennies) {
        if (pennies < balance){
            balance -= pennies;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void applyInterest() {
        if (balance > 0 ){
            double interest = balance * interestRate;
            balance += (int) interest;
        }
    }

    @Override
    public String accountInfo() {
        double d = (double) balance / 100;
        double i = interestRate * 100;
        String info = "Type of Account : Savings\n" +
                        "Account ID      : " + accountID +
                        "\nCurrent Balance : $" + String.format("%.2f", d) +
                        String.format("\nInterest rate   : %.2f", i) + "%";
        return info;
    }
    
}
