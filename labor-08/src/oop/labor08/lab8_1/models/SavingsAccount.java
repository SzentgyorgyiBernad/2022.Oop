package oop.labor08.lab8_1.models;

public class SavingsAccount  extends BankAccount{
    private double interestRate;

    public SavingsAccount(double interestRate) {
        //Super hivas az elso dolog
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest()
    {
        this.balance += balance*interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
