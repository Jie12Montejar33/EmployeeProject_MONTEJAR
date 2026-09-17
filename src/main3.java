import version3.BasePlusCommisonEmployee3;
import version3.CommisionEmployee3;
import version3.Employee;
import version3.HourlyEmployee3;
import version3.MyDate;
import version3.Name;
import version3.PieceWorkerEmployee3;

public class main3 {
    public static void main(String[] args) {
        MyDate[] em = {
                new MyDate("first", "C.", "last", "", 12, 1, 2009),
                new MyDate(1, 1, 2008)
        };

        for(MyDate emp : em){
            System.out.println(emp.toString());
        }

        MyDate em1 = new MyDate("first2", "C.", "last2", 3, 10, 2002);
        MyDate em2 = new MyDate();
        em2 = (MyDate) em1.clone();



        System.out.println(em2.toString());
    }
}
