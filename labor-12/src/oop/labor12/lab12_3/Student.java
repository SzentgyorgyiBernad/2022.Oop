package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Student {
    private final String ID;
    private  final String firstName;
    private final  String lastName;
    private double Magyar;
    private double Roman;
    private double Matek;

    public Student(String ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Magyar = 0;
        this.Roman = 0;
        this.Matek = 0;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMagyar(double magyar) {
        Magyar = magyar;
    }

    public void setRoman(double roman) {
        Roman = roman;
    }

    public void setMatek(double matek) {
        Matek = matek;
    }

    public double average()
    {
        double sum=0,average=0;
        if(Magyar>=5 && Matek>=5 && Roman>=5)
        {
            sum=this.Magyar+this.Matek+this.Roman;
            average=sum/3;
            return average;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "            Student{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "}\n";
    }
}
