package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Bac {
    public HashMap<Integer,Student> students;

    public Bac() {
        students=new HashMap<>();
        try(Scanner scanner=new Scanner(new File("nevek1.txt")))
        {
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(" ");
                String Id = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                this.students.put(Integer.parseInt(Id), new Student(Id,firstName, lastName));
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        readMarksFromCsvFile("matek.txt");
        readMarksFromCsvFile("roman.txt");
        readMarksFromCsvFile("magyar.txt");
        System.out.println("Passed students:"+number());

    }

    void readFromCSVFile(){

    }
    void readMarksFromCsvFile(String filename)
    {
        try(Scanner scanner=new Scanner(new File(filename)))
        {
            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(" ");
                    int Id =Integer.parseInt(items[0].trim());
                    double mark=Double.parseDouble(items[1].trim());
                    switch (filename)
                    {
                        case "matek.txt" :{
                            this.students.get(Id).setMatek(mark);
                        }
                        case "roman.txt" :{
                            this.students.get(Id).setRoman(mark);
                        }
                        case "magyar.txt" :{
                            this.students.get(Id).setMagyar(mark);
                        }

                    }
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public void printStudent()
    {
        for(Map.Entry<Integer,Student> item:students.entrySet()){
            System.out.println(item.getKey());
        }
        for(Integer key:students.keySet())
        {
            System.out.println(students.get(key));
        }
    }

    public int number()
    {
        int numberStudents=0;
        for(Student s:students.values())
        {
            if(s.average()>=6)
            {
                numberStudents++;
            }
        }
        return numberStudents;
    }
}
