package oop.labor03.lab3_1.lab3_2;

import oop.labor03.lab3_1.lab3_1.BankAccount;

import java.util.Random;


public class Main {
    public static void main(String[] args)
    {
        Random rand=new Random();
        Customer2 customer1 = new Customer2("John", "BLACK");
        Customer2 customer2 = new Customer2("Marry", "WHITE");
        for(int i=0;i<5;i++)
        {
            customer1.addAccount(new BankAccount("OTP00000"+i));
        }
        for(int i=0;i<9;i++)
        {
            customer2.addAccount(new BankAccount("OTP00000"+i));
        }
        System.out.println(customer1);
        System.out.println(customer2);
        for(int i=0;i< customer1.getNumAccounts();i++)
        {
            double price=1 + rand.nextInt(10000);
            customer1.getAccount("OTP00000"+i).deposit(price);
        }
        for(int i=0;i< customer2.getNumAccounts();i++)
        {
            double price=1 + rand.nextInt(10000);
            customer2.getAccount("OTP00000"+i).deposit(price);
        }
        for(int i=0;i< customer1.getNumAccounts();i++)
        {
            if(i==0)
            {
                customer1.closeAccount("OTP00000"+i);
                break;
            }
        }
        for(int i=0;i< customer2.getNumAccounts();i++)
        {
            if(i==customer2.getNumAccounts()-1)
            {
                customer2.closeAccount("OTP00000"+(i));
                break;
            }
        }
        customer1.closeAccount("OTP00000"+"0");
        customer1.closeAccount("OTP00000"+customer2.getNumAccounts());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
