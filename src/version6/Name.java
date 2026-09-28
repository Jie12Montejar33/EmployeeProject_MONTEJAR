package version6;

import java.util.Objects;

public final class Name {
    private final String fname;
    private final String mi;
    private final String lname;
    private final String suffix;

    public Name() {
        this.fname = "";
        this.mi = "";
        this.lname = "";
        this.suffix = "";
    }

    public Name(String fname) {
        this.fname = fname;
        this.suffix = "";
        this.mi = "";
        this.lname = "";
    }

    public Name(String fname, String mi) {
        this.fname = fname;
        this.mi = mi;
        this.suffix = "";
        this.lname = "";
    }

    public Name(String fname, String mi, String lname) {
        this.fname = fname;
        this.mi = mi;
        this.lname = lname;
        this.suffix = "";
    }

    public Name(String fname, String mi, String lname, String suffix) {
        this.fname = normalize(fname);
        this.mi = normalize(mi);
        this.lname = normalize(lname);
        this.suffix = normalize(suffix);
    }

    private static String normalize(String value) {
        return value == null ? "" : value.trim();
    }

    public String getFname() {
        return fname;
    }

    public String getMi() {
        return mi;
    }

    public String getLname() {
        return lname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void displayName(){
        System.out.printf("Name: ");
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Name name = (Name) other;
        return Objects.equals(fname, name.fname)
                && Objects.equals(mi, name.mi)
                && Objects.equals(lname, name.lname)
                && Objects.equals(suffix, name.suffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, mi, lname, suffix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(lname).append(", ").append(fname).append(" ").append(mi).append(" ").append(suffix);

        return sb.toString();
    }

}
