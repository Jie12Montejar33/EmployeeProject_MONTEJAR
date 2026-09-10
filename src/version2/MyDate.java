package version2;

public class MyDate {
    private String day;
    private int date;
    private int month;
    private int year;

    public MyDate(String day, int date, int month, int year) {
        this.day = day;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(date ).append(month).append(year);

        return sb.toString();
    }
}
