package verison1;

public class BasePlusCommisonEmployee {
    private int empID;
    private String empName;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommisonEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommisonEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommisonEmployee(int empID, String empName, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = totalSale;
        this.baseSalary = baseSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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
        double finalres = 0;
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

        finalres += baseSalary;

        return finalres;
    }

    public void displayBasePlusCommissionEmployee(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BasePlusCommisonEmployee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", totalSale=" + totalSale +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
