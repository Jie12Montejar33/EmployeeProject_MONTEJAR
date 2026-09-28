package version6;

import java.util.Objects;

public final class MyDate {
    private final int day;
    private final int month;
    private final int year;

    public MyDate() {
        this(1, 1, 1970);
    }

    public MyDate(int day, int month, int year) {
        validate(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String fname, String mi, String lname, String suffix, int day, int month, int year) {
        this(day, month, year);
    }

    public MyDate(String fname, String mi, String lname, int day, int month, int year) {
        this(day, month, year);
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    private static void validate(int day, int month, int year) {
        if (day < 1 || day > 31) throw new IllegalArgumentException("Day must be between 1 and 31");
        if (month < 1 || month > 12) throw new IllegalArgumentException("Month must be between 1 and 12");
        if (year < 1) throw new IllegalArgumentException("Year must be positive");
    }

    public void displayDate(){
        System.out.print("Info: ");
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        MyDate date = (MyDate) other;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "Date: " + day + "-" + month + "-" + year;
    }
}
