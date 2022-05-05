package oop.labor10.lab10_1.lab10_2;

public class Main {
    public static void main(String[] args) {
        Company company=new Company("Microsoft");
        company.hireAll("bemenet.csv");
        System.out.println("Employees:");
        System.out.println(company);
    }

}
