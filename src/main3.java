import version3.BasePlusCommisonEmployee3;
import version3.CommisionEmployee3;
import version3.HourlyEmployee3;
import version3.MyDate;
import version3.Name;
import version3.PieceWorkerEmployee3;

public class main3 {
    public static void main(String[] args) {
        Name employeeName = new Name("first", "C.", "lastna");
        MyDate employeeDate = new MyDate(1, 12, 2006);

        System.out.println("--- Version 3 Name & Date Output ---\n");
        employeeName.displayName();
        employeeDate.displayDate();

        HourlyEmployee3 hourlyEmployee = new HourlyEmployee3(
                12, "Hourly Employee", 13, 40, 12, 6);
        hourlyEmployee.displayHourlyEmployee();
        System.out.println("Salary: " + hourlyEmployee.computeSalary());
        System.out.println(hourlyEmployee);

        PieceWorkerEmployee3 pieceWorkerEmployee = new PieceWorkerEmployee3(
                13, "Piece Worker", 34, 12, 12, 6);
        pieceWorkerEmployee.displayPieceWorkerEmployee();
        System.out.println("Salary: " + pieceWorkerEmployee.computeSalary());
        System.out.println(pieceWorkerEmployee);

        CommisionEmployee3 commissionEmployee = new CommisionEmployee3(
                14, "Commission Employee", 1200, 12, 6);
        commissionEmployee.displayComissionEmployee();
        System.out.println("Salary: " + commissionEmployee.computeSalary());
        System.out.println("June salary: " + commissionEmployee.computeSalary(6));
        System.out.println(commissionEmployee);

        BasePlusCommisonEmployee3 basePlusEmployee = new BasePlusCommisonEmployee3(
                15, "Base Plus Commission", 134.0, 50000.0);
        basePlusEmployee.displayBasePlusCommissionEmployee();
        System.out.println("Salary: " + basePlusEmployee.computeSalary());
        System.out.println("December salary: " + basePlusEmployee.computeSalary(12));
        System.out.println(basePlusEmployee);
    }
}
