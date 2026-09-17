package version3;

import java.util.Objects;

public class MyDate extends Name { // Now a subclass of Name
    private int day;
    private int month;
    private int year;


    public MyDate() {
        super();
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }


    public MyDate(int day, int month, int year) {
        super();
        setDay(day);
        setMonth(month);
        this.year = year;
    }


    public MyDate(String fname, String mi, String lname, String suffix, int day, int month, int year) {
        super(fname, mi, lname, suffix);
        setDay(day);
        setMonth(month);
        this.year = year;
    }

    public MyDate(String fname, String mi, String lname, int day, int month, int year) {
        super(fname, mi, lname);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }
    public void setDay(int day) {
        if (day < 1 || day > 31) throw new IllegalArgumentException("Day must be between 1 and 31");
        this.day = day;
    }
    public int getMonth() { return month; }
    public void setMonth(int month) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("Month must be between 1 and 12");
        this.month = month;
    }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public void displayDate(){
        System.out.printf("Info: ");
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;


        if (!super.equals(other)) return false;

        MyDate date = (MyDate) other;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), day, month, year);
    }

    @Override
    public String toString() {
        return super.toString() + "| Date: " + day + "-" + month + "-" + year;
    }

    @Override
    public MyDate clone(){
        return (MyDate) super.clone();
    }

}
