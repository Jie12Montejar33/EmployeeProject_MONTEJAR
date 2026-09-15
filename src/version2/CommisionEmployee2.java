package version2;

public class CommisionEmployee2 {
    private int empId;
    private String Name;
    private double totalSale;
    private int dateHired;
    private int birthDate;

    public CommisionEmployee2(int empId, String name, double totalSale, int dateHired, int birthDate) {
        this.empId = empId;
        Name = name;
        this.totalSale = totalSale;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public CommisionEmployee2(String name, int empId) {
        Name = name;
        this.empId = empId;
    }

    public CommisionEmployee2(int empId, String name, int dateHired, int birthDate) {
        this.empId = empId;
        Name = name;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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
        System.out.printf("[ID = %d, Name = %s, TotalSales = %.2f]\n", empId, Name, totalSale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[ID = ").append(empId);
        sb.append(", Name= ").append(Name);
        sb.append(", totalSales = ").append(totalSale);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(", Hire Date = ").append(dateHired);
        sb.append(", Birth Date = ").append(birthDate);
        sb.append(']');
        return sb.toString();
    }
}
