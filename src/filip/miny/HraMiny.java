package filip.miny;

/**
 * Reprezentuje hracie pole
 * @author Filip
 * @version 1.0
 */
public class HraMiny {
    private Policko[][] policka;
    private int pocet;


    public HraMiny(int pocetRiadkov, int pocetStlpcov) {
        this.policka = new Policko[pocetRiadkov][pocetStlpcov];
        for (int riadok = 0; riadok < pocetRiadkov; riadok++) {
            for (int stlpec = 0; stlpec < pocetStlpcov; stlpec++) {
                this.policka[riadok][stlpec] = new Policko(true,-1);
            }
        }

    }
}
