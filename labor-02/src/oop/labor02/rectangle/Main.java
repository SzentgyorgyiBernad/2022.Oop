package oop.labor02.rectangle;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Rectangle[] rectangles = new Rectangle[ 10 ];
        Random rand = new Random();
        double length = 1 + rand.nextInt(10);
        double width = 1 + rand.nextInt(10) ;
        for(int i=0;i<10;i++)
        {
            rectangles[ i ] = new Rectangle(length, width);
            length = 1 + rand.nextInt(10);
            width = 1 + rand.nextInt(10) ;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("Length:"+rectangles[i].getLength()+"    Width"+rectangles[i].getWidth()+"    Perimeter="+rectangles[i].perimeter(rectangles[i].getLength(),rectangles[i].getWidth())+"    Area:"+rectangles[i].area(rectangles[i].getLength(),rectangles[i].getWidth()));
        }
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum+=rectangles[i].area(rectangles[i].getLength(),rectangles[i].getWidth());
        }
        System.out.println("The total area of the generated rectangles: "+sum);
    }
}
