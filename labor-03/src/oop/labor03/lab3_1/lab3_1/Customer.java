package oop.labor03.lab3_1.lab3_1;

import oop.labor03.lab3_1.lab3_1.BankAccount;

public class Customer {
    private final String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void setAccount(BankAccount account)
    {
        this.account=account;
    }
    public BankAccount getAccount()
    {
        return this.account;
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
    public void closeAccount()
    {
        account=null;
    }
    public String toString()
    {
        if(account==null)
        {
            return this.firstName+" "+this.lastName+"    Account:No account";
        }
        else return this.firstName+" "+this.lastName+"    Account:"+account;
    }
}
