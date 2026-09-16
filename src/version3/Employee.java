package version3;

public class Employee extends Name {
    private int empID;
    private String employeeName;
    private int dateHired;
    private int birthDate;

    public Employee() {
        this(0, "", 0, 0);
    }

    public Employee(int empID, String name) {
        this(empID, name, 0, 0);
    }

    public Employee(int empID, String name, int dateHired, int birthDate) {
        super();
        this.empID = empID;
        this.employeeName = name;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpId() {
        return empID;
    }

    public void setEmpId(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return employeeName;
    }

    public void setName(String name) {
        this.employeeName = name;
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

    protected String employeeDetails() {
        return "ID = " + empID
                + ", Name = " + employeeName
                + ", Hire Date = " + dateHired
                + ", Birth Date = " + birthDate;
    }

    @Override
    public String toString() {
        return "[" + employeeDetails() + "]";
    }
}
