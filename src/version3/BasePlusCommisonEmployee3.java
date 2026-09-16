package version3;

public class BasePlusCommisonEmployee3 extends Name {
    private int empID;
    private String Name;
    private double totalSale;
    private double baseSalary;
    private int dateHired;
    private int birthDate;

    public BasePlusCommisonEmployee3(int empID, String name, int dateHired, int birthDate) {
        this.empID = empID;
        Name = name;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public BasePlusCommisonEmployee3(int empID, String name) {
        this.empID = empID;
        Name = name;
    }

    public BasePlusCommisonEmployee3(int empID, String name, double baseSalary, double totalSale) {
        this.empID = empID;
        Name = name;
        this.baseSalary = baseSalary;
        this.totalSale = totalSale;
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

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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

    public double computeSalary(int currentMonth) {
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

        res += baseSalary;

        if(birthDate == currentMonth) {
            res += 5000;
        }

        return res;
    }

    public double computeSalary() {
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

        res += baseSalary;

        return res;
    }

    public void displayBasePlusCommissionEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalSales = %.2f, BaseSalary = %.2f]\n", empID, Name, totalSale, baseSalary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[ID = ").append(empID);
        sb.append(", Name= ").append(Name);
        sb.append(", TotalSale = ").append(totalSale);
        sb.append(", BaseSalary = ").append(baseSalary);
        sb.append(", Salary = ").append(computeSalary(12));
        sb.append(", Hire Date = ").append(dateHired);
        sb.append(", Birth Date = ").append(birthDate);
        sb.append(']');

        return sb.toString();
    }
}
