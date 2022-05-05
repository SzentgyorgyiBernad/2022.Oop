package oop.labor10.lab11_2;

public class Student {
    private final String NeptunID;
    public final String firstName;
    public String lastName;
    private int credits;
    MyDate birthdate;

    public Student(String neptunID, String firstName, String lastName, int credits, int year,int month,int day) throws InvalidDateException {
        NeptunID = neptunID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.credits = credits;
        this.birthdate = new MyDate(year,month,day);
    }

    @Override
    public String toString() {
        return "Student{" +
                "NeptunID='" + NeptunID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", credits=" + credits +
                ", birthdate=" + birthdate +
                '}';
    }
}
