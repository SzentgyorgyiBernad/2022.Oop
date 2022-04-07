package oop.labor08.lab8_1.models;

public class CheckingAccount extends BankAccount {
    private double overDraftLimit;

    public CheckingAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance+ overDraftLimit){
            balance-=amount;
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
