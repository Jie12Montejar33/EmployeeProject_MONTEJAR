package version4;

public class PieceWorkerEmployee extends Employee {
    private float totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee(int empID, String name, float totalPiecesFinished, double ratePerPiece, int dateHired, int birthDate) {
        super(empID, name, dateHired, birthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String name, int birthDate, int dateHired) {
        super(empID, name, dateHired, birthDate);
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

    public double computeSalary(int month){
        double res = 0;
        double bsp = 0;
        double bonusp = 0;

        bsp = this.totalPiecesFinished * ratePerPiece;
        bonusp = (totalPiecesFinished / 100) * (10 * ratePerPiece);
        res = bsp + bonusp;

        if(getBirthDate() == month){
            return res + 5000;
        }

        return res;
    }

    public void displayPieceWorkerEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalPiecesFinished = %.2f, RatePerPiece = %.2f]\n", getEmpID(), getName(), totalPiecesFinished, ratePerPiece);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[").append(employeeDetails());
        sb.append(", TotalPiecesFinished= ").append(totalPiecesFinished);
        sb.append(", RatePerPiece= ").append(ratePerPiece);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(']');

        return sb.toString();
    }
}
