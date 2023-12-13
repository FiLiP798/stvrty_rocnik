package filip.miny;

public class PrikazUkonci implements IPrikaz{

    @Override
    public void vykonaj(HraMiny hra) {
        hra.ukonci();
    }
}
