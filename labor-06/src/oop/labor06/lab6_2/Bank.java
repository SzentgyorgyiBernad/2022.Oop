package oop.labor06.lab6_2;

import oop.labor06.lab6_2.Customer2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private final String name;
    ArrayList<Customer2> customer=new ArrayList<Customer2>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer2 getCustomer(int id) {
        for(Customer2 c:customer)
        {
            if(c.getId()==id)
            {
                return c;
            }
        }
        return null;
    }
    public void addCustomer(Customer2 customer1)
    {
        this.customer.add(customer1);
    }
    public int numCustomers()
    {
        return customer.size();
    }
    public void printCustomersToFile(String fileName)
    {
        try(PrintStream printStream=new PrintStream(fileName))
        {
            printCustomers(printStream);
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    public void printCustomersToStdOut()
    {
        printCustomers(System.out);
    }
    private void printCustomers(PrintStream printStream)
    {
        printStream.println("Ide irunk ki");
        for( Customer2 c: customer ){
            printStream.println( c.getId()+", " + c.FirstName() +", "+
                    c.LastName()+", "+c.getNumAccounts());
            for(String num:c.getAccountNumbers())
            {
                System.out.println(num);
            }
        }
    }
}
