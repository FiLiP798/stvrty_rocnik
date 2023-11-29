package filip.miny;

public class PrikazOdkry {
    private final int riadok;
    private final int stlpec;

    public PrikazOdkry(int riadok, int stlpec) {
        this.riadok = riadok;
        this.stlpec = stlpec;
    }

    public void vykonaj(HraMiny hra) {
        hra.odkry(this.riadok,this.stlpec);
    }
}
