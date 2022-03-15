package oop.labor04.lab4_2;

import java.util.ArrayList;
import java.util.Objects;

public class Customer2 {
    private final String firstName;
    private String lastName;
    private BankAccount account;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer2(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getNumAccounts()
    {
        return accounts.size();
    }
    public void addAccount(BankAccount accounts)
    {
        this.accounts.add(accounts);
    }
    public BankAccount getAccount(String accountNumber)
    {
        for(BankAccount acc:accounts)
        {
            if(acc.getAccountNumber().equals(accountNumber))
            {
                return acc;
            }
        }
        return null;
    }
    public String FirstName()
    {
        return this.firstName;
    }
    public String LastName()
    {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void closeAccount(String accountNumber)
    {
        for(BankAccount acc:accounts)
        {
            if(acc.getAccountNumber().equals(accountNumber))
            {
                accounts.remove(acc);
            }
            if(acc.getAccountNumber()==null)
            {
                System.out.println("This account number does not exist !");
            }
        }

    }
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount acc:accounts){
            result.append( "\t" + acc.toString() +"\n");
        }
        return result.toString();
    }
}
