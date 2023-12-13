package filip.miny;

public class PrikazOznac implements IPrikaz{
    private final int riadok;
    private final int stlpec;

    public PrikazOznac(int riadok, int stlpec) {
        this.riadok = riadok;
        this.stlpec = stlpec;
    }

    @Override
    public void vykonaj(HraMiny hra) {
        hra.oznac(riadok,stlpec);
    }
}
