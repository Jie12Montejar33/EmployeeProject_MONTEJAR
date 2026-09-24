package version5;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster {
    // 'size' is now treated as a maximum capacity limit since ArrayList resizes dynamically
    private int maxCapacity;
    private List<Employee> empList;

    public EmployeeRoster() {
        this(10);
    }

    public EmployeeRoster(int size) {
        this.maxCapacity = size > 0 ? size : 10;
        this.empList = new ArrayList<>(this.maxCapacity);
    }

    public int getSize() {
        return maxCapacity;
    }

    public void setSize(int size) {
        this.maxCapacity = size > 0 ? size : 10;

        // Truncate the list if the new max capacity is smaller than current employee count
        if (empList.size() > this.maxCapacity) {
            empList = new ArrayList<>(empList.subList(0, this.maxCapacity));
        }
    }

    // Changed to return a List instead of an array.
    // Returns a copy to protect the internal list from being modified externally.
    public List<Employee> getEmpList() {
        return new ArrayList<>(empList);
    }

    public void setEmpList(List<Employee> empList) {
        if (empList == null) {
            this.empList = new ArrayList<>();
        } else {
            this.empList = new ArrayList<>(empList);
        }
        this.maxCapacity = Math.max(this.maxCapacity, this.empList.size());
    }

    // ArrayList keeps track of its own size, replacing the need for a 'count' variable
    public int getCount() {
        return empList.size();
    }

    // setCount(int count) has been removed.
    // You cannot arbitrarily set the count of an ArrayList without adding/removing elements.

    public boolean addEmployee(Employee em2) {
        if (em2 == null) {
            return false;
        }
        if (empList.size() >= maxCapacity) {
            System.out.println("full");
            return false;
        }

        empList.add(em2);
        return true;
    }

    public Employee removeEmployee(int id) {
        if (empList.isEmpty()) {
            System.out.println("empty");
            return null;
        }

        for (int i = 0; i < empList.size(); i++) {
            Employee emp = empList.get(i);
            // Note: Used getEmpID() as it was in your original remove method
            if (emp != null && emp.getEmpID() == id) {
                // ArrayList automatically shifts elements to the left when you remove!
                return empList.remove(i);
            }
        }

        return null;
    }

    // Kept your wrapper method in case it is referenced elsewhere
    public Employee remnoveEmployee(int id) {
        return removeEmployee(id);
    }

    public Employee searchEmployee(int id) {
        if (empList.isEmpty()) {
            return null;
        }

        for (Employee emp : empList) {
            // Note: Used getEmpId() as it was in your original search method
            if (emp != null && emp.getEmpId() == id) {
                return emp;
            }
        }
        return null;
    }

    public int countHE() {
        int co = 0;
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) co++;
        }
        return co;
    }

    public int countPWE() {
        int co = 0;
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) co++;
        }
        return co;
    }

    public int countCE() {
        int co = 0;
        for (Employee emp : empList) {
            if (emp instanceof CommisionEmployee) co++;
        }
        return co;
    }

    public int countBPCE() {
        int co = 0;
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommisonEmployee) co++;
        }
        return co;
    }

    public void displayHE() {
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                ((HourlyEmployee) emp).displayHourlyEmployee();
            }
        }
    }

    public void displayPWE() {
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                ((PieceWorkerEmployee) emp).displayPieceWorkerEmployee();
            }
        }
    }

    public void displayCE() {
        for (Employee emp : empList) {
            if (emp instanceof CommisionEmployee) {
                ((CommisionEmployee) emp).displayComissionEmployee();
            }
        }
    }

    public void displayBPCE() {
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommisonEmployee) {
                ((BasePlusCommisonEmployee) emp).displayBasePlusCommissionEmployee();
            }
        }
    }

    public void displayALLEmployees() {
        for (Employee emp : empList) {
            if (emp != null) {
                System.out.println(emp.getClass().getSimpleName());
            }
        }
    }

    public void displayPayroll(int month) {
        for (Employee emp : empList) {
            if (emp == null) continue;

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
