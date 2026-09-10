package verison1;

public class CommisionEmployee {
    private int empId;
    private String empName;
    private double totalSale;

    public CommisionEmployee() {
        this.empId = 0;
        this.empName = "N/A";
        this.totalSale = 0;
    }

    public CommisionEmployee(int empId, String empName) {
        this.empName = empName;
        this.empId = empId;
    }

    public CommisionEmployee(int empId, String empName, double totalSale) {
        this.empId = empId;
        this.totalSale = totalSale;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public void displayComissionEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalSales = %.2f]\n", empId, empName, totalSale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[ID = ").append(empId);
        sb.append(", Name= ").append(empName);
        sb.append(", totalSales = ").append(totalSale);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(']');
        return sb.toString();
    }
}
