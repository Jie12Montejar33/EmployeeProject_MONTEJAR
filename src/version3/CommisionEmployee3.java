package version3;

public class CommisionEmployee3 extends Employee {
    private double totalSale;

    public CommisionEmployee3(int empId, String name, double totalSale, int dateHired, int birthDate) {
        super(empId, name, dateHired, birthDate);
        this.totalSale = totalSale;
    }

    public CommisionEmployee3(String name, int empId) {
        super(empId, name);
    }

    public CommisionEmployee3(int empId, String name, int dateHired, int birthDate) {
        super(empId, name, dateHired, birthDate);
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double computeSalary() {
        if (this.totalSale <= 0) {
            return 0.0;
        }
        if (this.totalSale < 50000) {
            return this.totalSale * 0.05;
        }
        else if (this.totalSale < 100000) {
            return this.totalSale * 0.10;
        }
        else if (this.totalSale < 500000) {
            return this.totalSale * 0.15;
        }
        else {
            return this.totalSale * 0.20;
        }
    }

    public double computeSalary(int month) {
        if (this.totalSale <= 0) {
            return 0.0;
        }

        double salary;
        if (this.totalSale < 50000) {
            salary = this.totalSale * 0.05;
        }
        else if (this.totalSale < 100000) {
            salary = this.totalSale * 0.10;
        }
        else if (this.totalSale < 500000) {
            salary = this.totalSale * 0.15;
        }
        else {
            salary = this.totalSale * 0.20;
        }

        if (getBirthDate() == month) {
            salary += 5000;
        }

        return salary;
    }

    public void displayComissionEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalSales = %.2f]\n", getEmpID(), getName(), totalSale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[").append(employeeDetails());
        sb.append(", totalSales = ").append(totalSale);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(']');
        return sb.toString();
    }
}
