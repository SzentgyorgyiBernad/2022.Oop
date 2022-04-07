package oop.labor06.lab6_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        ArrayList<BankAccount> acc=new ArrayList<>();
        for(int i=0;i<200;i++)
        {
            acc.add(new BankAccount());
        }
        for(BankAccount a:acc)
        {
            System.out.println(a);
            System.out.println();
        }
        ArrayList<Customer2> customers=new ArrayList<>();
            customers.add(new Customer2("Simon","Peter"));
            customers.add(new Customer2("Simo","Robert"));
            customers.add(new Customer2("Szoverfi","Daniel"));
            for(Customer2 c:customers)
            {
                System.out.println(c);
                for(int i=0;i<rand.nextInt(10);i++);
                {
                    //customers.add(new BankAccount());
                }
            }
    }
}
