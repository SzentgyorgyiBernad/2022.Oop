package oop.labor10.lab10_1.lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

public class Company {
    private  String name;
    private ArrayList<Employee> employees=new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public void hire(Employee man)
    {
        if(!employees.contains(man))
        {
            employees.add(man);
        }
    }
    public void hireAll(String csvFile)
    {
        try(Scanner scanner=new Scanner(new File(csvFile)))
        {
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(", ");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                double salary =Double.parseDouble(items[2].trim());
                int year  =Integer.parseInt(items[3].trim());
                int month  =Integer.parseInt(items[4].trim());
                int day  =Integer.parseInt(items[5].trim());
                MyDate date=new MyDate(year,month,day);
                if(items.length==7)
                {
                    String department  = items[6].trim();
                    employees.add(new Manager(firstName,lastName,salary,date,department));
                }
                else
                {
                    employees.add (new Employee(firstName,lastName,salary,date));
                }
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public void fire(int ID)
    {
        for(int i=0;i< employees.size();i++)
        {
            if(employees.get(i).getID()==ID);
            {
                employees.remove(i);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(employees, company.employees);
    }

    public void printAll(PrintStream printStream)
    {
        for(Employee e:employees)
        {
            printStream.println(e);
        }
    }

    void sortByComparator(Comparator<Employee> employeeComparator)
    {
        //Collections.sort(employees,employeeComparator);
        employees.sort(employeeComparator);
    }
}
