package oop.labor05.models;


import oop.labor02.date.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private final ArrayList<Student> enrolledStudents=new ArrayList<Student>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }
    public boolean enroll(Student student)
    {
            if(enrolledStudents.contains(student)){
                return false;
            }
            enrolledStudents.add(student);
            return true;
    }
    public Student findStudenById(String ID)
    {
        for (Student student: this.enrolledStudents ){
            if(student.getID().equals(ID)){
                return student;
            }
        }
        return null;
    }

    public Course getCourse() {
        return this.course;
    }

    public int numEnrolled()
    {
        return enrolledStudents.size();
    }

    public void printToFile()
    {
        String fileName=String.format("%s_%s_%s.csv",course.getName(),startDate,endDate);
        try(PrintStream printstream=new PrintStream(fileName))
        {
            //Kiiratas
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Training{\n" +
                "        course=" + course +
                "\n        startDate=" + startDate +
                "\n        endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                "\n" + enrolledStudents+
                '}';
    }
    public void unenroll(String id)
    {

    }
}
