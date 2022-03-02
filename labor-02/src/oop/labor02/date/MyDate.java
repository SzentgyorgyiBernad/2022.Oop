package oop.labor02.date;

public class MyDate {
    private int year,month,day;

    public MyDate(int year,int month,int day)
    {
        if(DateUtil.isValidDate(year,month,day))
        {
            this.year=year;
            this.month=month;
            this.day=day;
        }
    }

    public int getYear()
    {
        return this.year;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getDay()
    {
        return this.day;
    }
    public String toString()
    {
        String Year, Month,Day;
        Year=String.valueOf(year);
        Month=String.valueOf(month);
        Day=String.valueOf(day);
        return Year+" - "+Month+" - "+Day;
    }
}
