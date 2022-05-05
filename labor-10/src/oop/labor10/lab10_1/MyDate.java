package oop.labor10.lab10_1;

public class MyDate implements Comparable<MyDate> {
    private int year,month,day;

    public MyDate(int year, int month, int day)
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
        return "Year:"+Year+" Month:"+Month+" Day:"+Day;
    }

    @Override
    public int compareTo(MyDate that) {
        if(this.year==that.year)
        {
            if(this.month==that.month)
            {
                return this.day- that.day;
            }
            return this.month- that.month;
        }
        return this.year-that.year;
    }
}
