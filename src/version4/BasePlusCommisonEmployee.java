package version4;

public class BasePlusCommisonEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommisonEmployee(int empID, String name, int dateHired, int birthDate) {
        super(empID, name, dateHired, birthDate);
    }

    public BasePlusCommisonEmployee(int empID, String name) {
        super(name, empID);
    }

    public BasePlusCommisonEmployee(int empID, String name, double baseSalary, double totalSale) {
        super(name, empID);
        this.baseSalary = baseSalary;
        setTotalSale(totalSale);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary(int currentMonth) {
        return super.computeSalary(currentMonth) + baseSalary;
    }

    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    public void displayBasePlusCommissionEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalSales = %.2f, BaseSalary = %.2f]\n", getEmpID(), getName(), getTotalSale(), baseSalary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[").append(employeeDetails());
        sb.append(", TotalSale = ").append(getTotalSale());
        sb.append(", BaseSalary = ").append(baseSalary);
        sb.append(", Salary = ").append(computeSalary(12));
        sb.append(']');

        return sb.toString();
    }
}
