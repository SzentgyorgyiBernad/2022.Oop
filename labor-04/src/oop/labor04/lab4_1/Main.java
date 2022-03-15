package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    readFilePrintItsLineNumber("lab4_1_input.txt");
    ArrayList<Person> persons1= readFromCSVFile("labor4_1_input.csv");
    for(Person person:persons1)
    {
        System.out.println(person);
    }

    }

    public static ArrayList<Person> readFromCSVFile(String fileName){
        ArrayList<Person> persons = new ArrayList<>();
        System.out.println(persons.size());
        persons.add(new Person("Szentgyorgyi","Bernad",2002));
// Open the file
// ...
// Read data from file
        try(Scanner scanner=new Scanner(new File(fileName)))
        {

            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add( new Person(firstName, lastName, birtYear));
            }

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return persons;
    }

    public static void readFilePrintItsLineNumber(String fileName)
    {
        try (Scanner scanner = new Scanner( new File(fileName))){
            while(scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
