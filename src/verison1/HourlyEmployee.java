package verison1;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public void displayHourlyEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalHoursWorked = %.2f, ratePerHour = %.2f]\n", empID, empName, totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[ID = ").append(empID);
        sb.append(", Name = ").append(empName);
        sb.append(", TotalHoursWorked =").append(totalHoursWorked);
        sb.append(", RatePerHour =").append(ratePerHour);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(']');

        return sb.toString();
    }


}
