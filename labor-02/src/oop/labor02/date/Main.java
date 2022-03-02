package oop.labor02.date;

import java.time.Year;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);

        MyDate[] date=new MyDate[1000];
        Random rand = new Random();
        int year,month,day;
        year=rand.nextInt(10000);
        month=rand.nextInt(25);
        day=rand.nextInt(50);
        int count=0;
        for(int i=0;i<1000;i++)
        {
            date[i]=new MyDate(year,month,day);
            if(DateUtil.isValidDate(year,month,day))
            {
                System.out.println();
            }
            else count++;
            year=rand.nextInt(10000);
            month=rand.nextInt(25);
            day=rand.nextInt(50);
        }
        System.out.println();
    }
}
