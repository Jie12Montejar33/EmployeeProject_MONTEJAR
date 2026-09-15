import version2.BasePlusCommisonEmployee2;
import version2.Name;
import version2.MyDate;
import java.time.LocalDate;
import java.time.Month;
public class main2 {
    public static void main(String[] args) {
        Name myna = new Name("first", "C.", "lastna");
        MyDate myda = new MyDate(1, 12, 2006);
        System.out.println("--- Name & Date Output Verification ---\n");
        myna.displayName();
        myda.displayDate();
    }
}
