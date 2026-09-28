package version6;

public abstract class Employee {
    private final int empID;
    private final String employeeName;
    private final int dateHired;
    private final int birthDate;

    public Employee() {
        this(0, "Unnamed Employee", 0, 0);
    }

    public Employee(int empID, String name) {
        this(empID, name, 0, 0);
    }

    public Employee(int empID, String name, int dateHired, int birthDate) {
        if (empID < 0) {
            throw new IllegalArgumentException("Employee ID cannot be negative");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be blank");
        }
        if (dateHired < 0 || birthDate < 0) {
            throw new IllegalArgumentException("Dates cannot be negative");
        }
        this.empID = empID;
        this.employeeName = name;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public int getEmpId() {
        return empID;
    }

    public String getName() {
        return employeeName;
    }

    public int getDateHired() {
        return dateHired;
    }

    public int getBirthDate() {
        return birthDate;
    }

    protected String employeeDetails() {
        return "ID = " + empID
                + ", Name = " + employeeName
                + ", Hire Date = " + dateHired
                + ", Birth Date = " + birthDate;
    }

    protected static void requireFiniteNonNegative(double value, String fieldName) {
        if (!Double.isFinite(value) || value < 0) {
            throw new IllegalArgumentException(fieldName + " must be finite and non-negative");
        }
    }

    protected static void requireFiniteNonNegative(float value, String fieldName) {
        if (!Float.isFinite(value) || value < 0) {
            throw new IllegalArgumentException(fieldName + " must be finite and non-negative");
        }
    }

    @Override
    public String toString() {
        return "[" + employeeDetails() + "]";
    }

    public abstract double computeSalary();

    public abstract double computeSalary(int month);
}
