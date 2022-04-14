package oop.labor08.lab8_2;

import oop.labor08.lab8_1.Bank.Bank;
import oop.labor08.lab8_1.Customer.Customer2;
import oop.labor08.lab8_1.models.BankAccount;
import oop.labor08.lab8_1.models.CheckingAccount;
import oop.labor08.lab8_1.models.SavingsAccount;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CheckingAccount account1=new CheckingAccount(10000);
        //BankAccount account2=new CheckingAccount(100000);
        //SavingsAccount account3=new SavingsAccount(0.02);
        //System.out.println(account2);
        //System.out.println(account3);
        Random rand = new Random();
        Customer2 customer1=new Customer2("Tavish","Kishori");
        Customer2 customer2=new Customer2("Rick","Grimes");
        Bank OTP=new Bank("OTP");

        OTP.addCustomer(customer1);
        OTP.addCustomer(customer2);

        CheckingAccount checaccount1=new CheckingAccount(10000);
        SavingsAccount saveaccount1=new SavingsAccount(0.02);

        OTP.getCustomer(1).addAccount(checaccount1);
        OTP.getCustomer(1).addAccount(saveaccount1);

        CheckingAccount checaccount2=new CheckingAccount(20000);
        SavingsAccount saveaccount2=new SavingsAccount(0.12);

        OTP.getCustomer(2).addAccount(checaccount2);
        OTP.getCustomer(2).addAccount(saveaccount2);

        OTP.getCustomer(1).getAccount("OTP0000001").deposit(rand.nextInt(1000));
        OTP.getCustomer(1).getAccount("OTP0000001").deposit(rand.nextInt(1000));


        for(int i=1;i<=OTP.numCustomers();i++)
        {
            System.out.println(OTP.getCustomer(i));
        }

        OTP.getCustomer(1).getAccount("OTP0000001").withdraw(100000000);
        OTP.getCustomer(2).getAccount("OTP0000001").withdraw(1000000000);

        for(int i=1;i<=OTP.numCustomers();i++)
        {
            //System.out.println(OTP.getCustomer(i).getAccount("OTP0000001").getBalance());
        }
        //getAccount("OTP0000001")
        //2. Feladat
        /*StackAggregation stack1 = new StackAggregation( 5 );
        for( int i=0; i<10; ++i ){

            stack1.push( i );
        }
        System.out.print("StackAggregation : ");
        while( !stack1.isEmpty() ){
            System.out.print( stack1.top() + " ");
            stack1.pop();
        }
        System.out.println();*/
    }
}
