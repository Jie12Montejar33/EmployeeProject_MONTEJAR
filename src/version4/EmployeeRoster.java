package version4;

public class EmployeeRoster {
    private int size;
    private Employee [] empList;
    private int count = 0;

    public EmployeeRoster() {
        this.size = 10;
        empList = new Employee [this.size];
        this.count = 0;
    }

    public EmployeeRoster(int size) {
        this.size = size;
        empList = new Employee [size];
        this.count = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean addEmployee(Employee em2){
        if(this.count >= size){
            System.out.println("full");
            return false;
        }
        empList[count] = em2;

        count++;

        return true;
    }

    public Employee remnoveEmployee(int id){
        if(this.count == 0){
            System.out.println("empty");
            return null;
        }

        int p = 0;

        for(int i = 0; i < empList.length; i++){
            if(empList[i].getEmpID() == id){
                break;
            }
            p++;
        }

        Employee re = empList[p];

        for(int i = p; i < empList.length; i++){
            empList[i] = empList[i+1];
        }

        count--;
        return re;

    }

    public Employee searchEmployee (int id){
        if(this.count == 0){
            return null;
        }
        int i;
        for(i = 0; i < empList.length && empList[i].getEmpId() != id; i++){}
        return empList[i];
    }

    public int countHE(){
        int co = 0;
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof HourlyEmployee){
                co++;
            }
        }

        return co;
    }

    public int countPWE(){
        int co = 0;
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                co++;
            }
        }

        return co;
    }

    public int countCE(){
        int co = 0;
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof CommisionEmployee){
                co++;
            }
        }

        return co;
    }

    public int countBPCE(){
        int co = 0;
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof BasePlusCommisonEmployee){
                co++;
            }
        }

        return co;
    }

    public void displayHE(){
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof HourlyEmployee){
                ((HourlyEmployee) empList[i]).displayHourlyEmployee();
            }
        }
    }

    public void displayPWE(){
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                ((PieceWorkerEmployee) empList[i]).displayPieceWorkerEmployee();
            }
        }
    }

    public void displayCE(){
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof CommisionEmployee){
                ((CommisionEmployee) empList[i]).displayComissionEmployee();
            }
        }
    }

    public void displayBPCE(){
        for(int i = 0; i < empList.length; i++){
            if(empList[i] instanceof BasePlusCommisonEmployee){
                ((BasePlusCommisonEmployee) empList[i]).displayBasePlusCommissionEmployee();
            }
        }
    }

    public void displayALLEmployees(){
        for(int i = 0; i < empList.length; i++){
            System.out.println(empList[i].getClass().getSimpleName());
        }
    }

    public void displayPayroll(int month){
        for(int i = 0; i < empList.length; i++){

                Employee emp = empList[i];
                double salary = 0.0;
                String details = "";

                if(emp instanceof HourlyEmployee){
                    HourlyEmployee hem = (HourlyEmployee)emp;
                    salary = hem.computeSalary(month);
                    details = "Base: " + hem.getRatePerHour();
                }
                else if(emp instanceof CommisionEmployee){
                }
        }
    }









}
