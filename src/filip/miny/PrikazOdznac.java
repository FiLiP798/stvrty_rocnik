package filip.miny;

public class PrikazOdznac implements IPrikaz{
    private final int riadok;
    private final int stlpec;

    public PrikazOdznac(int riadok, int stlpec) {
        this.riadok = riadok;
        this.stlpec = stlpec;
    }

    @Override
    public void vykonaj(HraMiny hra) {
        hra.odznac(riadok,stlpec);
    }
}
