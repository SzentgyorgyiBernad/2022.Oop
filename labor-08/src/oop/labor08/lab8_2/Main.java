package oop.labor08.lab8_2;

import oop.labor08.lab8_1.models.BankAccount;
import oop.labor08.lab8_1.models.CheckingAccount;
import oop.labor08.lab8_1.models.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        //CheckingAccount account1=new CheckingAccount(10000);
        //BankAccount account2=new CheckingAccount(100000);
        //SavingsAccount account3=new SavingsAccount(0.02);
        //System.out.println(account2);
        //System.out.println(account3);
        StackAggregation stack1 = new StackAggregation( 5 );
        for( int i=0; i<10; ++i ){

            stack1.push( i );
        }
        System.out.print("StackAggregation : ");
        while( !stack1.isEmpty() ){
            System.out.print( stack1.top() + " ");
            stack1.pop();
        }
        System.out.println();
    }
}
