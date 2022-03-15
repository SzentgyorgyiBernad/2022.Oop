package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName,String lastName,int birthYear)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthYear=birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

}