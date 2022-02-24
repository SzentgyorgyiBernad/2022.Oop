package oop.labor02.bank;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println("Account number="+account1.getAccountNumber());
        System.out.println("Account balance="+account1.getBalance());
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.withdraw(2500);
        boolean result=account1.withdraw(2500);
        if(!result)
        {
            System.out.println("You do not have sufficient funds for this operation!");
        }
        //System.out.println(account1.getAccountNumber()+ ": "+ account1.getBalance());
        System.out.println("Account number="+account1.getAccountNumber());
        System.out.println("Account balance="+account1.getBalance());
        account1.withdraw(1000);
        System.out.println(account1.getAccountNumber()+ ": "+ account1.getBalance());
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println("Account2"+account2.getAccountNumber()+ ": "+ account2.getBalance());
        account2.deposit(2000);
        System.out.println("Account2"+account2.getAccountNumber()+ ": "+ account2.getBalance());
        System.out.println(account1.toString());
    }
}
