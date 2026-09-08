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

    public double computerSalary() {
        double res = 0;
        if(totalSale < 50000){
            res = 0.05 * totalSale;
        }
        else if(totalSale >= 50000 && totalSale <= 99999.99){
            res = 0.10 * totalSale;
        }
        else if(totalSale >= 100000 && totalSale <= 499999.99){
            res = 0.15 * totalSale;
        }
        else {
            res = 0.20 * totalSale;
        }

        return res;
    }
}
