package oop.labor10.lab11_2;

public class DateUtil {
    public static boolean leapYear(int year)
    {
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year,int month,int day)
    {
        if(leapYear(year) && year>0)
        {
            if(month==2 && day>0 && day<=29)
            {
                return true;
            }
        }
        else if(year>0)
        {
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 && day>0 && day<=31 && year<=2022)
            {
                if(day>0 && day<=31 && year<=2022) return true;
            }
            else if(month==4 || month==6 || month==9 || month==11)
            {
                if(day>0 && day<=30 && year<=2022) return true;
            }
            else if(month==2 && day>0 && day<=28) return true;
        }
        return false;
    }
}

