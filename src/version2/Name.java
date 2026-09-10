package version2;

public class Name {
    private String fname;
    private String mi;
    private String lname;
    private String suffix;

    public Name(String fname, String mi, String lname, String suffix) {
        this.fname = fname;
        this.mi = mi;
        this.lname = lname;
        this.suffix = suffix;
    }

    public Name(String fname, String lname, String suffix) {
        this.fname = fname;
        this.mi = " ";
        this.lname = lname;
        this.suffix = suffix;
    }

    public Name(String fname, String lname) {
        this.fname = fname;
        this.mi = " ";
        this.lname = lname;
        this.suffix = " ";
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


}
