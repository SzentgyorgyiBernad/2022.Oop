package oop.labor03.lab3_1.lab3_1;

import oop.labor03.lab3_1.lab3_1.BankAccount;
import oop.labor03.lab3_1.lab3_1.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1.toString());
        System.out.println(customer1); // RECOMMENDED APPROACH!!
        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1.toString());
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        customer1.getAccount().deposit(2000);
        customer1.getAccount().withdraw(1500);
        customer1.getAccount().deposit(10);
        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2.toString());
        customer1.getAccount().deposit(100000);
        customer1.getAccount().withdraw(25000);
        customer1.getAccount().withdraw(235790);
        customer2.closeAccount();
        System.out.println(customer2.toString());
        customer1.setLastName(customer2.LastName());
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}
