package oop.labor08.lab8_1.Customer;

import oop.labor08.lab8_1.models.BankAccount;

import java.util.ArrayList;

public class Customer2 {
    private final String firstName;
    private String lastName;
    private BankAccount account;
    private final int id;
    private static int numCustomer=0;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer2(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=++numCustomer;
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

    public int getId() {
        return id;
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append(this.id+this.firstName + ' ' + this.lastName + " accounts:\n");
        for(BankAccount acc:accounts){
            result.append( "\t" + acc.toString() +"\n");
        }
        return result.toString();
    }
}
