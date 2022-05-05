package oop.labor10.lab11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adj meg szamokat szokozzel elvalasztva\n");
        String line= scanner.nextLine();
        String[] numbers=line.split(" ");
        double sum=0;
        for(String num:numbers)
        {
            try{
                sum+=Double.parseDouble(num.trim());
            }
            catch (NumberFormatException ex){

                System.out.println("Hibas input:"+num+" nem szam");
            }
        }
        System.out.println("Osszeg="+sum);
    }
}
