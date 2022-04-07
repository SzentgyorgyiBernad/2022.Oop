package oop.labor06.lab6_2;

public class BankAccount {
    private double balance;
    private final String accountNumber;

    public static final String PREFIX = "OTP";
    public static final int accountNumberLength = 10;
    private static int numAccounts=0;

    //Constructor
    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber() {
        int zeros=accountNumberLength-PREFIX.length()-String.valueOf(numAccounts).length();
        return PREFIX+"0".repeat(zeros)+numAccounts;
    }

    //getters
    public double getBalance(){
        return this.balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if(amount>0)
        {
            balance += amount;
        }

    }

    public boolean withdraw(double amount){

        if(amount <= balance){
            balance-=amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String Account = this.accountNumber;
        Account += " account number, your balance is: ";
        Account += this.balance;
        Account += " EUR.";
        return Account;
    }

}
