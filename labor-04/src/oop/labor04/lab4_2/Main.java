package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer2> customers = getCustomerData("lab4_2_input.txt");

        if (customers != null) {
            for (Customer2 customer: customers) {
                System.out.println(customer);
            }
        }
    }

    public static ArrayList<Customer2> getCustomerData(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {

            ArrayList<Customer2> customers = new ArrayList<>();
            int index = -1;
            int accountNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] data = line.split(",");
                if (Objects.equals(data[0], "Customer")) {
                    accountNum = 0;
                    customers.add(new Customer2(data[1], data[2]));
                    index++;
                } else {
                    String accountNumber = data[1].trim();
                    double amount = Double.parseDouble(data[2].trim());
                    customers.get(index).addAccount(accountNumber);
                    customers.get(index).getAccount(accountNum++).deposit(amount);
                }
            }

            return customers;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
