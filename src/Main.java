import verison1.BasePlusCommisonEmployee;
import verison1.CommisionEmployee;
import verison1.HourlyEmployee;
import verison1.PieceWorkerEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HourlyEmployee h1 = new HourlyEmployee(12, "name2", 13, 40);

        h1.displayHourlyEmployee();
        double r = h1.computeSalary();
        System.out.println(r);
        h1.setEmpID(67);
        h1.displayHourlyEmployee();


        PieceWorkerEmployee p1 = new PieceWorkerEmployee(12, "me", 34, 12);
        p1.displayPieceWorkerEmployee();
        double r2 = p1.computeSalary();
        System.out.println(r2);
        p1.setRatePerPiece(1200);
        System.out.println(p1.toString());



        CommisionEmployee em1 = new CommisionEmployee(13, "andrei",1200);
        em1.displayComissionEmployee();
        em1.setTotalSale(2000);
        em1.displayComissionEmployee();
        System.out.println(em1.computeSalary());

        BasePlusCommisonEmployee b1 = new BasePlusCommisonEmployee(3, "medd", 134, 50);
        b1.displayBasePlusCommissionEmployee();
        b1.setEmpName("none");
        b1.displayBasePlusCommissionEmployee();
        double ls34 = b1.computeSalary();

        System.out.println(ls34);
    }
}