package oop.labor02.date;

public class DateUtil {
    public boolean leapYear(int year)
    {
        if(year%4==0 && year%100!=0 && year%400==0)
        {
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year,int month,int day)
    {
        if(year%4==0 && year%100!=0 && year%400==0 && year<=2022 && month==2 && day>0 && day<30) return true;
        else
        {
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 && day>0 && day<=31 && year<=2022)  return true;
            if(month==4 || month==6 || month==9 || month==11 && day>0 && day<=30 && year<=2022) return true;
            if(month==2 && day>0 && day<=28) return true;
        }
        return false;
    }
}

