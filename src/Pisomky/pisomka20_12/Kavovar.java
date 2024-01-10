package Pisomky.pisomka20_12;

public class Kavovar {

    private double objemNadrze;
    private boolean maNapenovac;

    public Kavovar(double objemNadrze, boolean maNapenovac) {
        this.objemNadrze = objemNadrze;
        this.maNapenovac = maNapenovac;
    }

    public double getObjemNadrze() {
        return objemNadrze;
    }

    public boolean maNapenovac() {
        return maNapenovac;
    }

    @Override
    public String toString() {
        if (maNapenovac) {
            return "Objem nádrže je " + objemNadrze + " ml, kávovar má napeňovač";
        }
        return "Objem nádrže je " + objemNadrze + " ml, kávovar nemá napeňovač ";
    }
}
