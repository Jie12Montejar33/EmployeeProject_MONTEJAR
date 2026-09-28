package version6;

import java.util.Arrays;

public final class EmployeeRoster {
    private int size;
    private Employee[] empList;
    private int count;

    public EmployeeRoster() {
        this(10);
    }

    public EmployeeRoster(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Roster size must be positive");
        }
        this.size = size;
        this.empList = new Employee[this.size];
        this.count = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Roster size must be positive");
        }
        if (size < count) {
            throw new IllegalArgumentException("Roster size cannot be smaller than its employee count");
        }
        this.size = size;
        Employee[] newList = new Employee[this.size];
        System.arraycopy(empList, 0, newList, 0, count);
        this.empList = newList;
    }

    public Employee[] getEmpList() {
        return Arrays.copyOf(empList, count);
    }

    public void setEmpList(Employee[] empList) {
        if (empList == null) {
            throw new IllegalArgumentException("Employee list cannot be null");
        }
        if (empList.length > size) {
            throw new IllegalArgumentException("Employee list exceeds roster size");
        }
        for (Employee employee : empList) {
            if (employee == null) {
                throw new IllegalArgumentException("Employee list cannot contain null values");
            }
        }
        this.empList = Arrays.copyOf(empList, size);
        this.count = empList.length;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count < 0 || count > size) {
            throw new IllegalArgumentException("Employee count must be between 0 and roster size");
        }
        this.count = count;
    }

    public boolean addEmployee(Employee em2) {
        if (em2 == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        if (count >= size) {
            throw new IllegalStateException("Roster is full");
        }

        empList[count] = em2;
        count++;
        return true;
    }

    public Employee removeEmployee(int id) {
        if (count == 0) {
            System.out.println("empty");
            return null;
        }

        int index = -1;
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpID() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return null;
        }

        Employee removed = empList[index];
        for (int i = index; i < count - 1; i++) {
            empList[i] = empList[i + 1];
        }
        empList[count - 1] = null;
        count--;
        return removed;
    }

    public Employee remnoveEmployee(int id) {
        return removeEmployee(id);
    }

    public Employee searchEmployee(int id) {
        if (count == 0) {
            return null;
        }

        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpId() == id) {
                return empList[i];
            }
        }
        return null;
    }

    public int countHE() {
        int co = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                co++;
            }
        }
        return co;
    }

    public int countPWE() {
        int co = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                co++;
            }
        }
        return co;
    }

    public int countCE() {
        int co = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof CommisionEmployee) {
                co++;
            }
        }
        return co;
    }

    public int countBPCE() {
        int co = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommisonEmployee) {
                co++;
            }
        }
        return co;
    }

    public void displayHE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                ((HourlyEmployee) empList[i]).displayHourlyEmployee();
            }
        }
    }

    public void displayPWE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                ((PieceWorkerEmployee) empList[i]).displayPieceWorkerEmployee();
            }
        }
    }

    public void displayCE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof CommisionEmployee) {
                ((CommisionEmployee) empList[i]).displayComissionEmployee();
            }
        }
    }

    public void displayBPCE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommisonEmployee) {
                ((BasePlusCommisonEmployee) empList[i]).displayBasePlusCommissionEmployee();
            }
        }
    }

    public void displayALLEmployees() {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null) {
                System.out.println(empList[i].getClass().getSimpleName());
            }
        }
    }

    public void displayPayroll(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        for (int i = 0; i < count; i++) {
            Employee emp = empList[i];
            if (emp == null) {
                continue;
            }

            if (emp instanceof HourlyEmployee) {
                HourlyEmployee hem = (HourlyEmployee) emp;
                System.out.println("Hourly Employee: " + hem.getName() + ", Salary = " + hem.computeSalary(month));
            } else if (emp instanceof PieceWorkerEmployee) {
                PieceWorkerEmployee pwe = (PieceWorkerEmployee) emp;
                System.out.println("Piece Worker: " + pwe.getName() + ", Salary = " + pwe.computeSalary(month));
            } else if (emp instanceof BasePlusCommisonEmployee) {
                BasePlusCommisonEmployee bpce = (BasePlusCommisonEmployee) emp;
                System.out.println("Base Plus Commission Employee: " + bpce.getName() + ", Salary = " + bpce.computeSalary(month));
            } else if (emp instanceof CommisionEmployee) {
                CommisionEmployee ce = (CommisionEmployee) emp;
                System.out.println("Commission Employee: " + ce.getName() + ", Salary = " + ce.computeSalary(month));
            }
        }
    }
}
