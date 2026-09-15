package version2;
import java.time.LocalDate;
import java.time.Month;

public class HourlyEmployee2 {
    private int empID;
    private String Name;
    private float totalHoursWorked;
    private double ratePerHour;
    private int dateHired;
    private int birthDate;

    public HourlyEmployee2(int empID, String name, float totalHoursWorked, double ratePerHour, int dateHired, int birthDate) {
        this.empID = empID;
        Name = name;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public HourlyEmployee2(String name, int empID) {
        Name = name;
        this.empID = empID;
    }

    public HourlyEmployee2(String name, int empID, int dateHired, int birthDate) {
        Name = name;
        this.empID = empID;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getDateHired() {
        return dateHired;
    }

    public void setDateHired(int dateHired) {
        this.dateHired = dateHired;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public double computeSalary() {
        double res;
        if(this.totalHoursWorked <= 40){
            res = this.totalHoursWorked * ratePerHour;
        }
        else {
            double rp = 40 * ratePerHour;
            double op = (totalHoursWorked - 40) * (ratePerHour * 1.5);
            res = rp + op;
        }

        return res;
    }

    public double computeSalary(int month) {
        double res;
        if(this.totalHoursWorked <= 40){
            res = this.totalHoursWorked * ratePerHour;
        }
        else {
            double rp = 40 * ratePerHour;
            double op = (totalHoursWorked - 40) * (ratePerHour * 1.5);
            res = rp + op;
        }

        if(birthDate== month) {
            res += 5000;
        }

        return res;
    }

    public void displayHourlyEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalHoursWorked = %.2f, ratePerHour = %.2f]\n", empID, Name, totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[ID = ").append(empID);
        sb.append(", Name = ").append(Name);
        sb.append(", TotalHoursWorked =").append(totalHoursWorked);
        sb.append(", RatePerHour =").append(ratePerHour);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(", Hire Date = ").append(dateHired);
        sb.append(", Birth Date = ").append(birthDate);
        sb.append(']');

        return sb.toString();
    }
}
