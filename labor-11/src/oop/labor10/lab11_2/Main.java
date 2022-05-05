package oop.labor10.lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(new File("students.csv")))
        {
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(",");
                try{
                    String neptunID=items[0].trim();
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    int credits=Integer.parseInt(items[3].trim());
                    int birtYear = Integer.parseInt(items[4].trim());
                    int birtMonth = Integer.parseInt(items[5].trim());
                    int birtDay = Integer.parseInt(items[6].trim());

                    Student student=new Student(neptunID,firstName,lastName,credits,birtYear,birtMonth,birtDay);
                    System.out.println(student);
                }
                catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("INCOMPLETE LINE: "+line);
                }
                catch (NumberFormatException ex)
                {
                    System.out.println("NUMBER FORMAT EXCEPTION: "+line);
                }
                catch (InvalidDateException ex){
                    System.out.println("INVALID DATE: "+line);
                }
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
