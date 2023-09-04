package Homeworks.HW3;

public class CreditcardAccount extends BankAccount {

    private int limit;

    public CreditcardAccount(){
        limit = 0;
    }

    @Override
    public boolean debit(int pennies) {
        if (balance - pennies >= -limit){
            balance -= pennies;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void applyInterest() {
        if (balance < 0 ){
            double interest = balance * interestRate;
            balance += (int) interest;
        }
    }

    @Override
    public String accountInfo() {
        double d = (double) balance / 100;
        double i = interestRate * 100;
        double l = limit / 100;
        String info = "Type of Account : Creditcard\n" +
                        "Account ID      : " + accountID +
                        "\nCurrent Balance : $" + String.format("%.2f", -d) +
                        String.format("\nInterest rate   : %.2f", i) + "%" +
                        String.format("\nCredit Limit    : $%.2f", l);
        return info;
    }
    
    public int getLimit(){
        return limit;
    }

    public void setLimit(int lim){
        limit = lim;
    }

}
