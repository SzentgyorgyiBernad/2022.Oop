package oop.labor06.lab6_2;

import oop.labor06.lab6_2.Customer2;

public class Main {
    public static void main(String[] args) {
        Bank OTP=new Bank("Raiffeisen");
        OTP.addCustomer(new Customer2("Simon","Peter"));
        OTP.addCustomer(new Customer2("Simo","Robert"));
        OTP.addCustomer(new Customer2("Szoverfi","Daniel"));
        for(int i=0;i<OTP.numCustomers();i++)
        {
            for(int j=0;j<2;j++)
            {

            }
        }
    }
}
