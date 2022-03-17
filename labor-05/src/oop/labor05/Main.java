package oop.labor05;

import oop.labor05.models.Course;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses= readCourses("courses.csv");
        for(Course COurse:courses)
        {
            System.out.println(COurse);
        }
        ArrayList<Student> student=readStudent("student.csv");
        System.out.println("\n\n");
        for(Student students:student)
        {
            System.out.println(students);
        }

        for(Course c:courses)
        {
            //uj training letrehozas
            Training training=new Training();
            while(training.numEnrolled()<10)
        }


    }
    private static ArrayList<Course> readCourses(String filename){
    ArrayList<Course> courses=new ArrayList<Course>();
        try(Scanner scanner=new Scanner(new File(filename)))
        {

            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int numHours=Integer.parseInt(items[2].trim());
               courses.add( new Course(name,description,numHours));
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return courses;
    }
    private static ArrayList<Student> readStudent(String filename){
        ArrayList<Student> student=new ArrayList<Student>();
        try(Scanner scanner=new Scanner(new File(filename)))
        {

            while( scanner.hasNextLine() ){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String[] items = line.split(",");
                String ID = items[0].trim();
                String firstName = items[1].trim();
                String  lastName=items[2].trim();
                student.add( new Student(ID,firstName,lastName));
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return student;
    }
}
