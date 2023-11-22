package filip.miny;

public class KonzolovyZobrazovacHry {
    void zobraz(HraMiny hra) {
        for (int riadok = 0; riadok < hra.getPocetRiadkov(); riadok++) {
            for (int stlpec = 0; stlpec < hra.getPocetStlpcov(); stlpec++) {
                Policko policko = hra.getPolicko(riadok,stlpec);

            }
        }
    }
}
