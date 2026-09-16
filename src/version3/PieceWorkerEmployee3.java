package version3;

public class PieceWorkerEmployee3 extends Name {
    private int empID;
    private String Name;
    private float totalPiecesFinished;
    private double ratePerPiece;
    private int dateHired;
    private int birthDate;

    public PieceWorkerEmployee3(int empID, String name, float totalPiecesFinished, double ratePerPiece, int dateHired, int birthDate) {
        this.empID = empID;
        Name = name;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    public PieceWorkerEmployee3(int empID, String name, int birthDate, int dateHired) {
        this.empID = empID;
        Name = name;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public int getDateHired() {
        return dateHired;
    }

    public void setDateHired(int dateHired) {
        this.dateHired = dateHired;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
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

        if(birthDate == month){
            return res + 5000;
        }

        return res;
    }

    public void displayPieceWorkerEmployee(){
        System.out.printf("[ID = %d, Name = %s, TotalPiecesFinished = %.2f, RatePerPiece = %.2f]\n", empID, Name, totalPiecesFinished, ratePerPiece);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[ID = ").append(empID);
        sb.append(", Name= ").append(Name);
        sb.append(", TotalPiecesFinished= ").append(totalPiecesFinished);
        sb.append(", RatePerPiece= ").append(ratePerPiece);
        sb.append(", Salary = ").append(computeSalary());
        sb.append(", Hire Date = ").append(dateHired);
        sb.append(", Birth Date = ").append(birthDate);
        sb.append(']');

        return sb.toString();
    }
}
