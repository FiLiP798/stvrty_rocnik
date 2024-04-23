package Pisomky.pisomka27_03;

import java.util.ArrayList;
import java.util.List;

public class SystemPapaje {
    private List<Papaja> papaje;
    private int pocetOdstavenych = 0;

    public SystemPapaje() {
        papaje = new ArrayList<>();
    }

    public void pridajPapaju(Papaja papaja) {
        if (papaja.getHmotnost()>=200) {
            papaje.add(papaja);
        } else {
            this.pocetOdstavenych++;
        }
    }

    public int getPocetOdstavenych() {
        return this.pocetOdstavenych;
    }

    public int getNajvyssiaHmotnost() {
        int max = 0;
        for (int i = 0; i < papaje.size(); i++) {
            if (papaje.get(i).getHmotnost() > max) {
                max = papaje.get(i).getHmotnost();
            }
        }
        return max;
    }
    public Papaja vyhladaj(String identifikator) {
        for (Papaja papaja : papaje) {
            if (papaja.getIdentifikator().equals(identifikator)) {
                return papaja;
            }
        }
        return null;
    }
}
