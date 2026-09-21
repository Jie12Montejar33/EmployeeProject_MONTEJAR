package version4;

public class EmployeeRoster {
    private int size;
    private Employee[] empList;
    private int count;

    public EmployeeRoster() {
        this(10);
    }

    public EmployeeRoster(int size) {
        this.size = size > 0 ? size : 10;
        this.empList = new Employee[this.size];
        this.count = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size > 0 ? size : 10;
        Employee[] newList = new Employee[this.size];
        for (int i = 0; i < count && i < this.size; i++) {
            newList[i] = empList[i];
        }
        this.empList = newList;
    }

    public Employee[] getEmpList() {
        Employee[] result = new Employee[count];
        System.arraycopy(empList, 0, result, 0, count);
        return result;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
        this.count = (empList == null) ? 0 : empList.length;
        this.size = Math.max(this.size, this.count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = Math.max(0, count);
    }

    public boolean addEmployee(Employee em2) {
        if (em2 == null) {
            return false;
        }
        if (count >= size) {
            System.out.println("full");
            return false;
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
            } else if (emp instanceof CommisionEmployee) {
                CommisionEmployee ce = (CommisionEmployee) emp;
                System.out.println("Commission Employee: " + ce.getName() + ", Salary = " + ce.computeSalary(month));
            } else if (emp instanceof BasePlusCommisonEmployee) {
                BasePlusCommisonEmployee bpce = (BasePlusCommisonEmployee) emp;
                System.out.println("Base Plus Commission Employee: " + bpce.getName() + ", Salary = " + bpce.computeSalary(month));
            }
        }
    }
}
