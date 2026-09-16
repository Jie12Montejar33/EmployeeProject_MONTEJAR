import version3.BasePlusCommisonEmployee3;
import version3.CommisionEmployee3;
import version3.Employee;
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

        Employee[] employees = {
                new HourlyEmployee3(12, "Hourly Employee", 13, 40, 12, 6),
                new PieceWorkerEmployee3(13, "Piece Worker", 34, 12, 12, 6),
                new CommisionEmployee3(14, "Commission Employee", 1200, 12, 6),
                new BasePlusCommisonEmployee3(15, "Base Plus Commission", 134.0, 50000.0)
        };

        System.out.println("\n--- Employee Array Output ---");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
