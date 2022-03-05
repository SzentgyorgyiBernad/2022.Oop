package oop.labor03.lab3_1.lab3_2;

import oop.labor03.lab3_1.lab3_1.BankAccount;

public class Customer2 {
    private final String firstName;
    private String lastName;
    private BankAccount account;
    public static final int MAX_ACCOUNTS=10;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];


    public Customer2(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getNumAccounts()
    {
        return this.numAccounts;
    }
    public void addAccount(BankAccount accounts)
    {
        if(numAccounts<MAX_ACCOUNTS)
        {
            this.accounts[numAccounts]=accounts;
            numAccounts++;
        }
    }
    public BankAccount getAccount(String accountNumber)
    {
        for(int i=0;i<this.numAccounts;i++)
        {
            if(this.accounts[i].getAccountNumber().equals(accountNumber))
            {
                return accounts[i];
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
        for(int i=0;i<this.numAccounts;i++)
        {
            if(this.accounts[i].getAccountNumber().equals(accountNumber))
            {
                this.accounts[i]=null;
                System.arraycopy(this.accounts,i+1,this.accounts,i,this.numAccounts-i);
                this.numAccounts--;
                System.out.println("Account "+accountNumber+" was successfully deleted!");
                break;
            }
            if(i==numAccounts)
            {
                System.out.println("This account number does not exist !");
            }
        }

    }
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }
}
