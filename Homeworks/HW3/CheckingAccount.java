package Homeworks.HW3;

public class CheckingAccount extends BankAccount {

    private int overdraftFee;

    public CheckingAccount(){
        overdraftFee = 0;
    }

    @Override
    public boolean debit(int pennies) {
        balance -= pennies;
        if(balance < 0){
            balance -= overdraftFee;
        }
        return true;
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
        double odf = overdraftFee /100;
        String info = "Type of Account : Checking\n" +
                        "Account ID      : " + accountID +
                        "\nCurrent Balance : $" + String.format("%.2f", d) +
                        String.format("\nInterest rate   : %.2f", i) + "%" +
                        String.format("\nOverdraft Fee   : $%.2f", odf);
        return info;
    }
    
    public int getFee(){
        return overdraftFee;
    }

    public void setFee(int odf){
        overdraftFee = odf;
    }

}
