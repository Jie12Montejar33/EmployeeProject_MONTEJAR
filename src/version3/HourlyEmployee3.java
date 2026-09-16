package version3;

public class HourlyEmployee3 extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee3(int empID, String name, float totalHoursWorked, double ratePerHour, int dateHired, int birthDate) {
        super(empID, name, dateHired, birthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee3(String name, int empID) {
        super(empID, name);
    }

    public HourlyEmployee3(String name, int empID, int dateHired, int birthDate) {
        super(empID, name, dateHired, birthDate);
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

        if(getBirthDate() == month) {
            res += 5000;
        }

        return res;
    }

    public void displayHourlyEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalHoursWorked = %.2f, ratePerHour = %.2f]\n", getEmpID(), getName(), totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[").append(employeeDetails());
        sb.append(", TotalHoursWorked =").append(totalHoursWorked);
        sb.append(", RatePerHour =").append(ratePerHour);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(']');

        return sb.toString();
    }
}
