package verison1;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private float totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName, float totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary(){
        double res = 0;
        double bsp = 0;
        double bonusp = 0;

        bsp = this.totalPiecesFinished * ratePerPiece;
        bonusp = (totalPiecesFinished / 100) * (10 * ratePerPiece);
        res = bsp + bonusp;

        return res;
    }

    public void displayPieceWorkerEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalPiecesFinished = %.2f, RatePerPiece = %.2f]\n", empID, empName, totalPiecesFinished, ratePerPiece);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[ID = ").append(empID);
        sb.append(", Name= ").append(empName);
        sb.append(", TotalPiecesFinished= ").append(totalPiecesFinished);
        sb.append(", RatePerPiece= ").append(ratePerPiece);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(']');

        return sb.toString();
    }
}
