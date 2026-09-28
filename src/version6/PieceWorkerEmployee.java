package version6;

public final class PieceWorkerEmployee extends Employee {
    private float totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee(int empID, String name, float totalPiecesFinished, double ratePerPiece, int dateHired, int birthDate) {
        super(empID, name, dateHired, birthDate);
        setTotalPiecesFinished(totalPiecesFinished);
        setRatePerPiece(ratePerPiece);
    }

    public PieceWorkerEmployee(int empID, String name, int birthDate, int dateHired) {
        super(empID, name, dateHired, birthDate);
    }

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        requireFiniteNonNegative(totalPiecesFinished, "Total pieces finished");
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        requireFiniteNonNegative(ratePerPiece, "Rate per piece");
        this.ratePerPiece = ratePerPiece;
    }

    @Override
    public double computeSalary(){
        double res = 0;
        double bsp = 0;
        double bonusp = 0;

        bsp = this.totalPiecesFinished * ratePerPiece;
        bonusp = (totalPiecesFinished / 100) * (10 * ratePerPiece);
        res = bsp + bonusp;

        return res;
    }

    @Override
    public double computeSalary(int month){
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
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
