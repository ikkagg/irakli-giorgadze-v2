package ge.edu.btu;

public class Passenger {
    private String s;
    private boolean x;

    public Passenger(String s, boolean x) {
        this.s = s;
        this.x = x;
    }

    public String getS() {
        return s;
    }

    public boolean isX() {
        return x;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "მგზავრის" +
                "  სახელი - " + s + '\'' +
                ", ბილეთი -  " + x +
                ' ';
    }
}
