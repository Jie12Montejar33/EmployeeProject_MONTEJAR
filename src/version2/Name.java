package version2;

public class Name {
    private String fname;
    private String mi;
    private String lname;
    private String suffix;

    public Name(String fname) {
        this.fname = fname;
        this.suffix = "";
        this.mi = "";
    }

    public Name(String fname, String mi) {
        this.fname = fname;
        this.mi = mi;
        this.suffix = "";
    }


    public Name(String fname, String mi, String lname) {
        this.fname = fname;
        this.mi = mi;
        this.lname = lname;
        this.suffix = "";
    }

    public Name(String fname, String mi, String lname, String suffix) {
        this.fname = fname;
        this.mi = mi;
        this.lname = lname;
        this.suffix = suffix;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void displayName(){
        System.out.printf("Name: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(lname).append(", ").append(fname).append(" ").append(mi).append(" ").append(suffix);

        return sb.toString();
    }
}
