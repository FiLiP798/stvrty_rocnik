package filip.miny;

public class KonzolovyZobrazovacHry {
    public KonzolovyZobrazovacHry() {
    }

    public void zobraz(HraMiny hra) {
        for (int riadok = 0; riadok < hra.getPocetRiadkov(); riadok++) {
            for (int stlpec = 0; stlpec < hra.getPocetStlpcov(); stlpec++) {
                Policko policko = hra.getPolicko(riadok,stlpec);
                if (!policko.jeOdkryte()) {
                    System.out.print("#");
                } else if (policko.getPocet_min_okolo() == 0) {
                    System.out.print(".");
                } else if (policko.getPocet_min_okolo() > 0) {
                    System.out.print(policko.getPocet_min_okolo());
                } else if (policko.maMinu()) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
