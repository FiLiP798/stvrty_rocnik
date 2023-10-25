package filip.miny;

public class Pozicia {
    private int riadok;
    private int stlpec;

    public Pozicia(int riadok, int stlpec) {
        this.riadok = riadok;
        this.stlpec = stlpec;
    }

    public int getRiadok() {
        return riadok;
    }

    public int getStlpec() {
        return stlpec;
    }
    public boolean jeRovnaka(int riadok, int stlpec) {
        if (this.getRiadok() == riadok && this.getStlpec() == stlpec) {
            return true;
        }
        return false;
    }
}
